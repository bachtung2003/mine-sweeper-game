/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 * Name: Team 3
 * Tran Bach Tung - ITITIU21340
 * Trinh Thuy Tien - ITITIU21328
 * Bui Phuong Thanh - ITITIU21311
 * Le Do Cao Thi - ITCSIU21235
 * Purpose: Minesweeper game with many extra functions 
 */
import logic.Square;
 
public interface ITrans {
  Square[][] getListSquare();
 
  void play(int x, int y);
  void target(int x, int y);
  void restart();
  void undo();
}