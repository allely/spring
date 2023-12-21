package org.choongang.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="file")
public class FileProperties {
    private String url;     // file.url 주입
    private String path;    // file.path 주입
}
