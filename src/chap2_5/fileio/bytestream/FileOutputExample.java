package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {

        // 바이트 기반 출력 스트림 - 1 바이트 단위로 데이터 처리
        // 주로 이미지, 영상같은 바이너리 데이터 처리에 적합
        // new FileOutputStream(경로 + "세이브파일이름")
        try {
            FileOutputStream fos
                    = new FileOutputStream(FileExample.ROOT_PATH + "/pet.txt");

            String str = "dog";
            fos.write(new byte[]{99, 97, 116});


        } catch (FileNotFoundException e) {
            File rootDirectory = new File(FileExample.ROOT_PATH);
            if(!rootDirectory.exists()) {
                rootDirectory.mkdir();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
