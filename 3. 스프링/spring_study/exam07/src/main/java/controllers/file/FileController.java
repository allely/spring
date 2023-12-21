package controllers.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload")
    public String upload() {

        return "file/upload";
    }

    @PostMapping("/upload")
    public String uploadPs(@RequestParam("file") MultipartFile[] files) {
        for (MultipartFile file : files) {
            File uploadPath = new File("c:/uploads/" + file.getOriginalFilename());

            try {
                file.transferTo(uploadPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "file/upload";
    }
}
