package pixLab.classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	public static void testChromaKey()
	{
		Picture source = new Picture("map.jpg");
		Picture background = new Picture("flag2.jpg");
		source.explore();
		background.explore();
		source.chromaKey(background, Color.WHITE);
		source.explore();
	}
	
	public static void testGlitch()
	{
		Picture image = new Picture("png.png");
		Picture sm = new Picture("Small-mario.png");
		image.explore();
		image.glitch(image, 0, 0);
		image.explore();
	}
	
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testZeroRed()
  {
	  Picture beach = new Picture ("beach.jpg");
	  beach.explore();
	  beach.zeroRed();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRL */
  public static void testMirrorVerticleRL()
  {
	  Picture CumberlandIsland = new Picture("CumberlandIsland.jpg");
	  CumberlandIsland.explore();
	  CumberlandIsland.mirrorVerticleRL();
	  CumberlandIsland.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
	  Picture arch = new Picture("arch.jpg");
	  arch.explore();
	  arch.mirrorHorizontal();
	  arch.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testSuperGlitcher()
  {
	  Picture pic = new Picture("dangerDays.jpg");
	  pic.explore();
	  pic.superGlitcher();
	  pic.explore();
  }
  public static void testShiftLeftRight()
  {
	  Picture pic = new Picture("dangerDays.jpg");
	  pic.explore();
	  pic.superGlitcher();
	  pic.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("muhammadAli.jpg");
	  Picture message = new Picture("quote.jpg");
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  
	  testSuperGlitcher();
	  testSteganography();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testGlitch();
//	  testChromaKey();
//    testMirrorVertical();
//    testMirrorVerticleRL();
//    testMirrorHorizontal();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//  testShiftLeftRight();
  }
}