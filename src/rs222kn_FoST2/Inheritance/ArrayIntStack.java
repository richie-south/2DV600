package rs222kn_FoST2.Inheritance;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
  @Override
  public void push(int n) {
    if(size() == values.length) {
      resize();
    }

    int beShifted = values[0];
    values[0] = n;
    for (int i = 0; i < size(); i++) {
      int value = values[i + 1];
      values[i + 1] = beShifted;
      beShifted = value;
    }
    size++;
  }

  @Override
  public int pop() throws IndexOutOfBoundsException {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }

    int stackTop = values[0];
    for (int i = 0; i < size(); i++) {
      values[i] = values[i + 1];
    }
    size--;
    return stackTop;
  }

  @Override
  public int peek() throws IndexOutOfBoundsException {
    if (isEmpty()) {
      throw new IndexOutOfBoundsException();
    }

    return values[0];
  }
}
