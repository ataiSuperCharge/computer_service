package kg.easy.computerservice.services;


import kg.easy.computerservice.models.dto.PcDto1Ex;
import kg.easy.computerservice.models.entity.Pc;

import java.util.List;
import java.util.Map;

public interface PcService {

    List<PcDto1Ex> getAllPcLessThan(double price);

    List<Pc> getAllPcsLessThan(double price);

    List<Map<String, Object>> getAllLessThan(double price);
}
