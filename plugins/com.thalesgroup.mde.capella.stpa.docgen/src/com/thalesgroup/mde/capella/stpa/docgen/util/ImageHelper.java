/*******************************************************************************
 * Copyright (c) 2020-2024 THALES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    THALES - initial API and implementation
 *******************************************************************************/
package com.thalesgroup.mde.capella.stpa.docgen.util;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;
import org.polarsys.capella.core.data.capellacore.Constraint;

import com.thalesgroup.mde.capella.stpa.docgen.Activator;
import com.thalesgroup.mde.capella.stpa.model.StpaAnalysisElement;


/**
 * Forked from org.polarsys.capella.cybersecurity.docgen.utils.ImageHelper.
 */
public class ImageHelper {

	protected static final String PATH_IMG = "../icon/";
	protected static final String GIF_TYPE = ".gif";
	protected static final String PNG_TYPE = ".png";

	public static void createPNG(EObject element, String projectName, String outputFolder)
			throws IOException, CoreException {
		if (element instanceof StpaAnalysisElement) {
			copyFile(projectName, outputFolder, element.eClass().getName() + PNG_TYPE);
    } else if (element instanceof Constraint) {
			copyFile(projectName, outputFolder, Constraint.class.getSimpleName() + PNG_TYPE);
		}
	}

	public static void copyFile(String projectName, String outputFolder, String fileName)
			throws IOException, CoreException {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		InputStream stream = FileLocator.openStream(bundle, new Path("icons/" + fileName), false);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFolder folder = project.getFolder(outputFolder);
		String targetFilePath = folder.getParent().getProjectRelativePath().toString() + "/icon/" + fileName;
		IFile destinationFile = project.getFile(targetFilePath);
		if (!destinationFile.exists()) {
			destinationFile.create(stream, true, new NullProgressMonitor());
		}
		stream.close();
	}

	public static String getPathImgGif(EObject element) {
		if (element instanceof StpaAnalysisElement) {
			return PATH_IMG + element.eClass().getName() + GIF_TYPE;
    } else if (element instanceof Constraint) {
			return PATH_IMG + Constraint.class.getSimpleName() + GIF_TYPE;
    }
		return "";
	}
}
