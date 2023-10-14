// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobile.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the NativeMobile module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_RegisterBuilder(
		nativemobile.proxies.Registration _registration
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("NativeMobile.ACT_Register");
		builder = builder.withParam("Registration", _registration);
		return builder;
	}

	public static void aCT_Register(
		IContext context,
		nativemobile.proxies.Registration _registration
	)
	{
		aCT_RegisterBuilder(
				_registration
			)
			.execute(context);
	}
}
