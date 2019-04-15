int x=400;
int y=560;



Car chevy = new Car(400, 300, 50, 7);
Car ford = new Car(300, 200, 50, 8);
Car honda = new Car(200, 450, 50, 7);
Car flash = new Car(200, 150, 50, 9);
Car me = new Car(200, 450, 50, 7);
Car me2 = new Car(200, 350, 50, 10);
Car me3 = new Car(200, 400, 50, 7);
Car me4 = new Car(200, 380, 50,8);
Car me5 = new Car(200, 350, 50, 7);
Car me6 = new Car(200, 230, 50, 9);
Car me7 = new Car(200, 320, 50, 10);
Car me8 = new Car(200, 250, 50, 7);
Car me9 = new Car(200, 256, 50, 8);
Car me10 = new Car(200, 250, 50, 9);
void setup(){
size(800,600);



}
void draw(){
 background(200,150,230); 
 fill(80,90,255);
 ellipse(x,y,50,50);
 chevy.display();
 ford.display();
 honda.display();
 me2.display();
 me3.display();
 me4.display();
 me5.display();
 me6.display();
 me7.display();
  me8.display();
   me9.display();
    me10.display();
 
flash.display();
 chevy.left();
 ford.right();
 honda.left();
 me.right();
 flash.left();
  me2.right();
  me3.left();
  me4.right();
  me5.left();
  me6.right();
  me7.left();
  me8.right();
  me9.left();
  me10.right();
 }
 void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
              y=y-10;
                  //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
              y=y+10;
                  //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
              x=x+10;
                  //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
              x=x-10;
                  //Frog X position goes left
            }
      }
      if (x<0){
        x=0;
      }
      if (x>800){
        x=800;
      }
      if (y<0){
        y=0;
      }
      if (y>600){
        y=600;
      }
      
}