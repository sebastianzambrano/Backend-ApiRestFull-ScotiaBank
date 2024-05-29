package com.application.restfull.Service;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.DTO.IResultDto;
import com.application.restfull.DTO.IResultTimeDto;
import com.application.restfull.Entity.Pqrs;
import com.application.restfull.IReposiroty.IBaseRepository;
import com.application.restfull.IReposiroty.IPqrsRepository;
import com.application.restfull.IService.IPqrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PqrsService extends BaseService<Pqrs> implements IPqrsService {
    @Autowired
    private IPqrsRepository repository;
    @Override
    protected IBaseRepository<Pqrs, Long> getRepository() {
        return repository;
    }

    @Override
    public List<IPqrsDto> findPqrsByTypePqrs(String typePqrs) {
        return repository.findPqrsByTypePqrs(typePqrs);
    }

    @Override
    public List<IPqrsDto> findPqrsByCedula(String cedula) {return repository.findPqrsByCedula(cedula);
    }

    @Override
    public List<IResultDto> findPqrsByDate(LocalDate registroPqrs) {
        System.out.println("el tipo de dato es: "+registroPqrs.getClass());
        return repository.findPqrsByDate(registroPqrs);
    }

    @Override
    public List<IResultTimeDto> findPqrsByTime() {

        List<Pqrs> pqrsList = repository.findPqrsByTime();

        // Realizar la agrupación por usuario y tipo de PQRS
        Map<String, Map<String, List<Pqrs>>> groupedByUserAndType = pqrsList.stream()
            .collect(Collectors.groupingBy(Pqrs::getUsuario,
                Collectors.groupingBy(Pqrs::getTypePqrs)));

        // Calcular el promedio de tiempo para cada grupo y crear la lista de resumen
        List<IResultTimeDto> result = new ArrayList<>();
        groupedByUserAndType.forEach((usuario, typePqrsMap) -> {
            typePqrsMap.forEach((typePqrs, pqrsGroup) -> {
                long totalDuration = pqrsGroup.stream()
                    .mapToLong(pqrs -> Duration.between(pqrs.getHoraInicio(), pqrs.getHoraFin())
                        .getSeconds())
                    .sum();
                long averageDuration = pqrsGroup.isEmpty() ? 0 : totalDuration / pqrsGroup.size();

                // Formatear el promedio de tiempo en HH:mm:ss
                long hours = averageDuration / 3600;
                long minutes = (averageDuration % 3600) / 60;
                long seconds = averageDuration % 60;
                String promedioTiempo = String.format("%02d:%02d:%02d", hours, minutes, seconds);

                // Crear un objeto de resumen y agregarlo a la lista de resultados
                result.add(new IResultTimeDto() {
                    @Override
                    public String getUsuario() {
                        return usuario;
                    }

                    @Override
                    public String getTypePqrs() {
                        return typePqrs;
                    }

                    @Override
                    public String getPromedioTiempo() {
                        return promedioTiempo;
                    }
                });
            });
        });

        return result;
    }


        //return repository.findPqrsByTime();

}
