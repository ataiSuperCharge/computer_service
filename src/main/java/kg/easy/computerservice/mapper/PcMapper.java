package kg.easy.computerservice.mapper;

import kg.easy.computerservice.models.dto.PcDto1Ex;
import kg.easy.computerservice.models.entity.Pc;

public interface PcMapper {
    Pc pcDtoToPc(PcDto1Ex pcDto1Ex);



}
