int x=400;
int y=560;





void setup(){
size(800,600);
}
void draw(){
 background(200,150,230); 
 fill(80,90,255);
 ellipse(x,y,50,50);
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
}