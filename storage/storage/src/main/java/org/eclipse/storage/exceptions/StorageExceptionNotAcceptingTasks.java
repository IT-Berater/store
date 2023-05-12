package org.eclipse.storage.exceptions;

/*-
 * #%L
 * Eclipse Store Storage
 * %%
 * Copyright (C) 2019 - 2023 Eclipse Foundation
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

public class StorageExceptionNotAcceptingTasks extends StorageException
{
	///////////////////////////////////////////////////////////////////////////
	// constructors //
	/////////////////

	public StorageExceptionNotAcceptingTasks()
	{
		super();
	}

	public StorageExceptionNotAcceptingTasks(final String message)
	{
		super(message);
	}

	public StorageExceptionNotAcceptingTasks(final Throwable cause)
	{
		super(cause);
	}

	public StorageExceptionNotAcceptingTasks(final String message, final Throwable cause)
	{
		super(message, cause);
	}

	public StorageExceptionNotAcceptingTasks(
		final String    message           ,
		final Throwable cause             ,
		final boolean   enableSuppression ,
		final boolean   writableStackTrace
	)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}



}
