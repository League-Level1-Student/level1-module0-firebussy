int x=500;
int y=500;
int speed=50;
int yspeed=30;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
void setup() {
  size(1000, 1000);
  minim = new Minim (this);
sound = minim.loadSample("449397__d-w__toys-borken-rc-helicopter-19.wav", 128);
  backgroundImage = loadImage("Pong1.jpg");
}
void draw() {
  
   background(64,244,208);
  fill(173, 255, 47);
stroke(153, 50, 204);
ellipse(x, y, 40, 40);
x=x+speed;
if(x>=width){
  speed = -speed;
  sound.trigger();
  
}
rect(mouseX, mouseY, 20, 100);
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
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}//int
