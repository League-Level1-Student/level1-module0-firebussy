int y=0;
int x=500;
int w=20;
int h=20;
int score=0;
void setup() {
  size(1000, 1000);
}
void draw() {
  background(100, 255, 100);
  fill(random(256), 20, 255);
  stroke(4, 6, 9);
  ellipse(x, y, w, h);
  y+=20;
  if (y>1000) {
    checkCatch(x);
    x=(int)random(width);
    y=0;
 
  }
  rect( mouseX, mouseY, 50, h);
  println("Your score is now: " + score); 
  fill(255, 30, 30);
  textSize(120);
  text("Score: " + score, 100, 100);
}
void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
    score--;
  
}