package openCv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class openCv_Image {
	public static void main(String[] args)
	{
		// load the OpenCV native library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		// create and print on screen a 3x3 identity matrix
		System.out.println("Create a 3x3 identity matrix...");
		Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println("mat = " + mat.dump());
		
		// prepare to convert a RGB image in gray scale
		String location = "E:/openCv/src/resources/fb.jpg";
		
		
		System.out.print("Convert the image at " + location + " in gray scale... ");
		// get the jpeg image from the internal resource folder
		Mat image = Imgcodecs.imread(location);
		// convert the image in gray scale
		Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);
		// write the new image on disk
		Imgcodecs.imwrite("E:/openCv/src/resources/fb.jpg", image);
		System.out.println("Done!");
	}

}
