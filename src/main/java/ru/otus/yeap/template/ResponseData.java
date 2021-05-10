package ru.otus.yeap.template;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseData<T> {

    private T data;
    private String errorMessage;
    private Integer status;
    private long time = Instant.now().toEpochMilli();

    public ResponseData(T data) {
        this.data = data;
        this.status = 200;
        this.errorMessage = "";
    }

    public ResponseData(T data, String errorMessage, Integer status) {
        this.data = data;
        this.errorMessage = errorMessage;
        this.status = status;
    }
    public ResponseData(String errorMessage, Integer status) {
        this.errorMessage = errorMessage;
        this.status = status;
    }
}
