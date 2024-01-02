/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 * Name: Team 3
 * Tran Bach Tung - ITITIU21340
 * Trinh Thuy Tien - ITITIU21328
 * Bui Phuong Thanh - ITITIU21311
 * Le Do Cao Thi - ITCSIU21235
 * Purpose: Minesweeper game with many extra functions 
 */
public class Square {
    private boolean isOpen;
  private boolean hasMine;
  private int numMineAround;
  private boolean isTarget;
 
  public Square() {
    isOpen = false;
    hasMine = false;
    isTarget = false;
  }
 
  public boolean isOpen() {
    return isOpen;
  }
  public void setOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }
  public boolean isHasMine() {
    return hasMine;
  }
  public void setHasMine(boolean hasMine) {
    this.hasMine = hasMine;
  }
  public int getNumMineAround() {
    return numMineAround;
  }
  public void setNumMineAround(int numMineAround) {
    this.numMineAround = numMineAround;
  }
  public boolean isTarget() {
    return isTarget;
  }
  public void setTarget(boolean isTarget) {
    this.isTarget = isTarget;
  }
}
