package org.grails.plugins.jqplot

class JqplotTagLib {
    static namespace = "jqplot"

    def resources = {
        out << """
<!--[if lt IE 9]><script language="javascript" type="text/javascript" src="${g.resource(plugin: 'jqplot', dir: 'js/jqplot', file: 'excanvas.min.js')}"></script><![endif]-->
<script language="javascript" type="text/javascript" src="${g.resource(plugin: 'jqplot', dir: 'js/jqplot', file: 'jquery.jqplot.min.js')}"></script>
<link rel="stylesheet" type="text/css" href="${g.resource(plugin: 'jqplot', dir: 'css/jqplot', file: 'jquery.jqplot.min.css')}" />
"""
    }

    /**
     * attr name REQUIRED The name of the jqplot plugin to load
     */
    def plugin = {attrs->
        out << """
<script language="javascript" type="text/javascript" src="${g.resource(plugin: 'jqplot', dir: 'js/jqplot/plugins', file: 'jqplot.'+attrs.name+'.min.js')}"></script>
"""
    }
}
