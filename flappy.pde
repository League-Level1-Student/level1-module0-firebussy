int x=500;
int y =500;
int velocity=0;
int grav=1;
int X=1000;
int speed=10;
int pipeheight = (int) random(200, 800);
int gap=300;


void setup () {
  size(1000, 1000);
}


void draw() {
  background(90, 90, 90);
  fill(100, 50, 70);
  stroke(40, 70, 80);
  fill(0, 255, 0);


  rect(X, 0, 50, pipeheight);
  rect(X, pipeheight+gap, 50, height);
  X-=speed;
  velocity+=grav;
  y+=velocity;
  ellipse (x, y, 60, 60);

  if (mousePressed) {
    velocity=-10;
  }


  if (X<=0) {
    X=1000;
    pipeheight = (int) random(100, 400);
  }
  
  boolean collide = intersectsPipes();
  if (collide=false){
  println("Game Over");
  }
}


boolean intersectsPipes() { 
  if (y < pipeheight && x > X && x < (X+50)) {
    return true;
  } else if (y>pipeheight+gap && x > X && x < (x+50)) {
    return true;
  } else { 
    return false;
  }
}