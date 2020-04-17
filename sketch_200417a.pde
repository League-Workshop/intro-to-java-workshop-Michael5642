PImage catPic;
int ellipseXOne = 270;
int ellipseYOne = 234;
int ellipseXTwo = 167;
int ellipseYTwo = 270;
void setup(){
  size(500,500); 
  catPic = loadImage("cat.jpeg");
catPic.resize(500,500);
background(catPic);
  
  
  
}

void draw() {
fill(255,0,0);

  ellipse (ellipseXOne,ellipseYOne,25,25);
ellipse(ellipseXTwo,ellipseYTwo,25,25);

  if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
}
void keyPressed() {

  ellipseXOne++;
 ellipseYOne++;
 ellipseXTwo++;
 ellipseYTwo++;
}
