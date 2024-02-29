package P2.dragonGame;

import java.util.Scanner;

public class Dragon03 {
   int x, y, width, height;

   public Dragon03(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   void moveLeft() {
      --this.x;
      this.printPosition();
      this.detectCollision(this.x, this.y);

   }

   void moveRight() {
      ++this.x;
      this.printPosition();
      this.detectCollision(this.x, this.y);

   }

   void moveUp() {
      ++this.y;
      this.printPosition();
      this.detectCollision(this.x, this.y);

   }

   void moveDown() {
      --this.y;
      this.printPosition();
      this.detectCollision(this.x, this.y);
   }

   void printPosition() {
      System.out.println("x = " + this.x + ", y = " + this.y);
   }

   void detectCollision(int x, int y) {
      if (x < 0 || y < 0 || x > this.width || y > this.height) {
         System.out.println("Game Over");
         System.exit(0);
      }

   }

   public static void main(String[] args) {
      Scanner input03 = new Scanner(System.in);
      Dragon03 dragon = new Dragon03(5, 2, 10, 10);

      while (true) {
         System.out.print("Masukkan perintah (a/s/d/w): ");
         char input = input03.next().charAt(0);

         switch (input) {
            case 'a':
               dragon.moveLeft();
               break;
            case 'd':
               dragon.moveRight();
               break;
            case 'w':
               dragon.moveUp();
               break;
            case 's':
               dragon.moveDown();
               break;
            default:
               System.out.println("Perintah tidak valid!");
         }
      }

   }
}
