package com.javasimple.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RequestDto {

    @NotBlank(message = "Parameter1 is required")
    private String parameter1;

    @NotNull(message = "Parameter2 is required")
    private Integer parameter2;

    @NotBlank(message = "Parameter3 is required")
    private String parameter3;

    @NotBlank(message = "Parameter4 is required")
    private String parameter4;

    private String optionalParameter5;
    private String optionalParameter6;
    private Integer optionalParameter7;
    private String optionalParameter8;
    private Boolean optionalParameter9;
    private String optionalParameter10;
}
