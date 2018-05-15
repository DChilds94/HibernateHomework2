import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Folder folder1 = new Folder ("Documents");
        Folder folder2 = new Folder("Downloads");
        DBHelper.save(folder1);
        DBHelper.save(folder2);


        File file1 = new File("README", "txt", 10, folder1);
        File file2 = new File("Hello_Kitty_Screensaver", "jpg", 50, folder2);
        File file3 = new File("Hello_Kitty_Theme", "jpg", 50, folder2);
        File file4 = new File("Hell0_Kitty_Ringtone", "mp3", 20, folder2);
        DBHelper.save(file1);
        DBHelper.save(file2);
        DBHelper.save(file3);
        DBHelper.save(file4);
        DBHelper.delete(file3);


        List<Folder> folders = DBHelper.getAll(Folder.class);
        List<File>  files = DBHelper.getAll(File.class);
        File foundFile = DBHelper.find(File.class, file1.getId());
        Folder foundFolder = DBHelper.find(Folder.class, folder2.getId());
        List<File> helloKitty = DBFolder.getFilesFromFolder(foundFolder);
    }
}
