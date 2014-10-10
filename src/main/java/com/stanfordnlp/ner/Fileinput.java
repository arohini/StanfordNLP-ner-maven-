package com.stanfordnlp.ner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.process.DocumentPreprocessor;

public interface Fileinput {

	public static String serializedClassifier1 = "/home/serendio/stanford-ner-2014-08-27/classifiers/english.muc.7class.distsim.crf.ser.gz";
	AbstractSequenceClassifier<CoreLabel> classifier1 = CRFClassifier.getClassifierNoExceptions(serializedClassifier1);

}
