/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author tranbachtung
 */
import logic.Square;
 
public interface ITrans {
  Square[][] getListSquare();
 
  void play(int x, int y);
  void target(int x, int y);
  void restart();
}