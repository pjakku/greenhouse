package org.springframework.templating;

import org.springframework.core.io.Resource;

/**
 * Loads String templates from resource files.
 * @author Keith Donald
 */
public interface StringTemplateLoader {
	
	/**
	 * Load the StringTemplate from the file-based resource.
	 * The template text is generally parsed into a structure that is subsequently cached.
	 * StringTemplate instances returned to callers of this method are prototypes that may be safely modified and used in the current thread of execution.
	 */
	StringTemplate loadStringTemplate(Resource resource);
		
}
