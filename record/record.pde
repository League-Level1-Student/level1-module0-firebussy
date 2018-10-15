 import ddf.minim.*; 
 Minim minim;
 AudioPlayer song;
  PImage pictureOfRecord;     
  int zoom=0;
  void setup(){
    size(600,600);     //in setup method
    pictureOfRecord= loadImage("record.jpeg");     
    pictureOfRecord.resize(width,height);
    minim = new Minim(this);
    song = minim.loadFile("yay.mp3", 512);
  }
  
   void draw(){
     if(mousePressed){
     rotateImage(pictureOfRecord,zoom+=10000);
     song.play();
     }
     else{
     song.pause();
   }
  image(pictureOfRecord, 0, 0);     
  }
  void rotateImage(PImage image, int amountToRotate) {
       translate(width/2, height/2);
       rotate(amountToRotate*TWO_PI/360);
       translate(-image.width/2, -image.height/2);
  }
  