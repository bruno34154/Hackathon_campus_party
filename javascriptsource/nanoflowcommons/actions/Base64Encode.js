// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";
import { Base64 } from 'js-base64';

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {string} nano
 * @returns {Promise.<string>}
 */
export async function Base64Encode(nano) {
	// BEGIN USER CODE
    return Base64.encode(string);
	// END USER CODE
}
