package ai.smart.detection;

import ai.smart.detection.Classifier.Recognition;

import java.util.List;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
