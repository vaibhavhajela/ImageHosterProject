package ImageHoster.service;

import ImageHoster.ImageFileRepository;
import ImageHoster.model.Image;
import ImageHoster.model.ImageFile;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vaibhavhajela on 16/01/21.
 */
@Service
public class ImageFileService {

    @Autowired
    private ImageFileRepository imageFileRepository;

//    @Autowired
//    private ImageRepository imageRepository;


    public List<Image> getAllImages(){
        List<ImageFile> imageFiles =null;// imageRepository.getAllImages();
        List<Image> images = new ArrayList<>();
        for (ImageFile imageFile:imageFiles){
            images.add(new Image(1, imageFile.getTitle(), new String(Base64.encodeBase64(imageFile.getFiledata())), imageFile.getDescription(),new Date()));
        }
        return images;
    }
}
