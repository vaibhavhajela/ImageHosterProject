package ImageHoster.service;

import ImageHoster.controller.repository.ImageRepository;
import ImageHoster.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by vaibhavhajela on 17/01/21.
 */
@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public Image createImage(Image imageToCreate){
        return imageRepository.storeImage(imageToCreate);
    }

    public List<Image> getAllImages(){
        return imageRepository.getAllImagesNative();
    }
}
