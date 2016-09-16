package rs222kn_FoST2.Inheritance;

/**
 * Created by richardsoderman on 2016-09-13.
 */
public class ArrayIntList extends AbstractIntCollection implements IntList {
  @Override
  public void add(int n) {
    if(size() == values.length){
      resize();
    }
    values[size++] = n;
  }

  @Override
  public void addAt(int n, int index) throws IndexOutOfBoundsException {
    if(!checkIndex(index, size())){
      throw new IndexOutOfBoundsException();
    }

    int temp;
    int beShifted = values[index];
    values[index] = n;

    for(int i = index; i < size(); i++){
      if(size() > index){ resize(); }

      temp = values[i + 1];
      values[i + 1] = beShifted;
      beShifted = temp;
    }
    size++;
  }

  @Override
  public void remove(int index) throws IndexOutOfBoundsException {
    if(!checkIndex(index, size())){
      throw new IndexOutOfBoundsException();
    }

    for (int i = index; i < size(); i++){
      values[i] = values[i + 1];
    }
    size--;
  }

  @Override
  public int get(int index) throws IndexOutOfBoundsException {
    if(!checkIndex(index, size())){
      throw new IndexOutOfBoundsException();
    }
    return values[index];
  }

  @Override
  public int indexOf(int n) {
    for(int i = 0; i < size(); i++){
      if(values[i] == n){
        return i;
      }
    }
    return -1;
  }
}
