package threadsintro;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
  Prototype proto = new Cell1("A");
  List<String> sequenceList = new ArrayList<>();
  Prototype proto2 = new Cell2(sequenceList);
}

// Prototype pattern
abstract class Prototype implements Cloneable {
  public abstract Prototype clone() throws CloneNotSupportedException;
}

class Cell1 extends Prototype {
  public String name;
  
  Cell1(String _name){
    this.name = _name; 
  }
  
  @Override
  public Prototype clone() throws CloneNotSupportedException {
    return new Cell1(this.name);
  }
}

class Cell2 extends Prototype {
  List<String> dna = new ArrayList<String>();
  
  Cell2(List<String> _dna){
    this.dna = _dna;
  }

  @Override
  public Prototype clone() throws CloneNotSupportedException {
    List<String> tmpDna = new ArrayList<String>();
    for(String sequence : this.dna){
      tmpDna.add(sequence);
    }
    return new Cell2(tmpDna);
  }
}