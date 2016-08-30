package utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	public static void upload(String path, MultipartFile file, String filename) {
		InputStream is = null;
		OutputStream out = null;
		if (file != null) {

			try {
				is = file.getInputStream();
				out = new FileOutputStream(path + filename);
				int readbytes = 0;
				byte[] buffer = new byte[1024];
				while ((readbytes = is.read(buffer, 0, 1024)) != -1) {
					out.write(buffer, 0, readbytes);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					is.close();
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
