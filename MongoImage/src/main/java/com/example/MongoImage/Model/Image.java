package com.example.MongoImage.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.File;

@Getter
@Setter
@Data
public class Image {
@Id
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;


    public Image(String fileName, String fileDownloadUri, String contentType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = contentType;
        this.size = size;


    }
}
