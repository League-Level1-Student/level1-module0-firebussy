int x=500;
int y=500;
int speed=10;
int yspeed=15;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
void setup() {
  size(1000, 1000);
  minim = new Minim (this);
sound = minim.loadSample("415759__taiters__hawa.wav", 128);
backgroundImage = loadImage("pongggg.jpg");
}
void draw() {
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
   background(64,244,208);
  fill(173, 255, 47);
stroke(153, 50, 204);
ellipse(x, y, 40, 40);
x=x+speed;
if(x>=width){
  speed = -speed;
  sound.trigger();
}
if(x<=0){
  speed = -speed;
}
y=y+yspeed;
if(y>=height){
  yspeed = -yspeed;
 
}
if(y<=0){
  yspeed = -yspeed;
}
}
