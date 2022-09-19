package com.api.doc.swaggerdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "Details about the contacts") // for swagger doc
public class Contact {

    @ApiModelProperty(notes = "the unique ID of the contact") // for swagger doc
    private String id;

    @ApiModelProperty(notes = "The person's name")
    private String name;

    @ApiModelProperty(notes = "Phone number of user")
    private String phone;
}
