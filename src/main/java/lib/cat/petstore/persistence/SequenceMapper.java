package lib.cat.petstore.persistence;

import lib.cat.petstore.entity.Sequence;

public interface SequenceMapper {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
