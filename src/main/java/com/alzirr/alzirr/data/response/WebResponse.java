package com.alzirr.alzirr.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"code", "status", "message"})
public class WebResponse {
    @JsonProperty("code")
    private int code;

    @JsonProperty("status")
    private String status;

    @JsonProperty("message")
    private String message;
}
