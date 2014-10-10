package com.stanfordnlp.ner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;

public abstract class Entityextract {

	public static String serializedClassifier1 = null;
	static {
		serializedClassifier1 = "/home/serendio/stanford-ner-2014-08-27/classifiers/english.muc.7class.distsim.crf.ser.gz";

	}
}
