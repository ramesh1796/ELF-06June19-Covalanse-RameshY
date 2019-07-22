var html_editor = document.querySelector('#html textarea'),
    css_editor = document.querySelector('#css textarea'),
    js_editor = document.querySelector('#js textarea');
 
var editors = [html_editor, css_editor, js_editor];
 
// Attaching the onkeyup Event
editors.forEach(function(editor, i, arr) {
 
    editor.addEventListener('keyup', function() {

        render();
 
    }, false);
 
});

//step-2
var base_tpl =
    "<!doctype html>\n" +
    "<html>\n\t" +
    "<head>\n\t\t" +
    "<meta charset=\"utf-8\">\n\t\t" +
    "<title>Test</title>\n\n\t\t\n\t" +
    "</head>\n\t" +
    "<body>\n\t\n\t" +
    "</body>\n" +
    "</html>";
 
var prepareSource = function() {
    var html = html_editor.value,
        css = css_editor.value,
        js = js_editor.value,
        src = '';
 
    // HTML
    src = base_tpl.replace('</body>', html + '</body>');
 
    // CSS
    css = '<style>' + css + '</style>';
    src = src.replace('</head>', css + '</head>');
 
    // Javascript
    js = '<script>' + js + '</script>';
    src = src.replace('</body>', js + '</body>');
 
    return src;
};

//step-3

var render = function() {
    var source = prepareSource();
 
    var iframe = document.querySelector('#output iframe'),
        iframe_doc = iframe.contentDocument;
 
    iframe_doc.open();
    iframe_doc.write(source);
    iframe_doc.close();
};

//step-4

// For HTML
iframe_doc.body.innerHTML = code_for_body;
// or
var old_body = iframe_doc.body;
var new_body = document.createElement('body');
new_body.innerHTML = html_code;
old_body.parentNode.replaceChild(new_body, old_body);
 
// For CSS
var style = document.createElement('style');
style.innerHTML = css_code;
iframe_doc.head.appendChild(style);
 
// For JS
var script = document.createElement('script');
script.innerHTML = js_code;
iframe_doc.body.appendChild(script);

//step-5

var code = '';
editor.addEventListener('keyup', function() {
 
    if (code !== this.value) {
        render();
        code = this.value;
    }
}, false);