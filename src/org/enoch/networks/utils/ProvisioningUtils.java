package org.enoch.networks.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import gen.Channel;
import gen.Solution;

/**
 * @author Julian Enoch (julian.enoch@gmail.com)
 *
 */
public class ProvisioningUtils {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Solution solution = readProvisioning("src/solution.xml");

		for (Channel channel : solution.getChannels()) {
			System.out.println("**************************");
			System.out.println("requestIndex " + channel.getRequestIndex());
			System.out.println("startingSlot " + channel.getStartingSlot());
			System.out.println("routingPath  " + channel.getRoutingPath());
		}
	}

	public static Solution readProvisioning(String filePath) throws JAXBException, FileNotFoundException {
		JAXBContext jc = JAXBContext.newInstance("gen");
		Unmarshaller u = jc.createUnmarshaller();
		JAXBElement<Solution> element = (JAXBElement) u.unmarshal(new FileInputStream(filePath));
		Solution solution = (Solution) element.getValue();
		return solution;
	}

}
