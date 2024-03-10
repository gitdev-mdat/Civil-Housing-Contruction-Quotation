package com.example.system.dto.buildingdto.itemtypedto;

import com.example.system.dto.buildingdto.itemdto.ItemDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemTypeNameDto {
    private Long id;
    private String itemTypeName;
}