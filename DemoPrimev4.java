<!DOCTYPE html>
<!-- saved from url=(0045)https://www.jdoodle.com/online-java-compiler/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style id="ace-xcode">.ace-xcode .ace_gutter {background: #e8e8e8;color: #333}.ace-xcode .ace_print-margin {width: 1px;background: #e8e8e8}.ace-xcode {background-color: #FFFFFF;color: #000000}.ace-xcode .ace_cursor {color: #000000}.ace-xcode .ace_marker-layer .ace_selection {background: #B5D5FF}.ace-xcode.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px #FFFFFF;}.ace-xcode .ace_marker-layer .ace_step {background: rgb(198, 219, 174)}.ace-xcode .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid #BFBFBF}.ace-xcode .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.071)}.ace-xcode .ace_gutter-active-line {background-color: rgba(0, 0, 0, 0.071)}.ace-xcode .ace_marker-layer .ace_selected-word {border: 1px solid #B5D5FF}.ace-xcode .ace_constant.ace_language,.ace-xcode .ace_keyword,.ace-xcode .ace_meta,.ace-xcode .ace_variable.ace_language {color: #C800A4}.ace-xcode .ace_invisible {color: #BFBFBF}.ace-xcode .ace_constant.ace_character,.ace-xcode .ace_constant.ace_other {color: #275A5E}.ace-xcode .ace_constant.ace_numeric {color: #3A00DC}.ace-xcode .ace_entity.ace_other.ace_attribute-name,.ace-xcode .ace_support.ace_constant,.ace-xcode .ace_support.ace_function {color: #450084}.ace-xcode .ace_fold {background-color: #C800A4;border-color: #000000}.ace-xcode .ace_entity.ace_name.ace_tag,.ace-xcode .ace_support.ace_class,.ace-xcode .ace_support.ace_type {color: #790EAD}.ace-xcode .ace_storage {color: #C900A4}.ace-xcode .ace_string {color: #DF0002}.ace-xcode .ace_comment {color: #008E00}.ace-xcode .ace_indent-guide {background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==) right repeat-y}
/*# sourceURL=ace/css/ace-xcode */</style><style id="autocompletion.css">.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #CAD6FA;    z-index: 1;}.ace_dark.ace_editor.ace_autocomplete .ace_marker-layer .ace_active-line {    background-color: #3a674e;}.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid #abbffe;    margin-top: -1px;    background: rgba(233,233,253,0.4);    position: absolute;    z-index: 2;}.ace_dark.ace_editor.ace_autocomplete .ace_line-hover {    border: 1px solid rgba(109, 150, 13, 0.8);    background: rgba(58, 103, 78, 0.62);}.ace_completion-meta {    opacity: 0.5;    margin: 0.9em;}.ace_completion-message {    color: blue;}.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #2d69c7;}.ace_dark.ace_editor.ace_autocomplete .ace_completion-highlight{    color: #93ca12;}.ace_editor.ace_autocomplete {    width: 300px;    z-index: 200000;    border: 1px lightgray solid;    position: fixed;    box-shadow: 2px 3px 5px rgba(0,0,0,.2);    line-height: 1.4;    background: #fefefe;    color: #111;}.ace_dark.ace_editor.ace_autocomplete {    border: 1px #484747 solid;    box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.51);    line-height: 1.4;    background: #25282c;    color: #c1c1c1;}
/*# sourceURL=ace/css/autocompletion.css */</style><style>.ace_snippet-marker {    -moz-box-sizing: border-box;    box-sizing: border-box;    background: rgba(194, 193, 208, 0.09);    border: 1px dotted rgba(211, 208, 235, 0.62);    position: absolute;}</style><style>    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style id="ace-tm">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style id="ace_editor.css">.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_editor {position: relative;overflow: hidden;padding: 0;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;box-sizing: border-box;min-width: 100%;contain: style size layout;font-variant-ligatures: no-common-ligatures;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;contain: style size layout;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {position: absolute;top: 0;left: 0;right: 0;padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {contain: strict;position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;contain: strict;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: transparent;color: inherit;z-index: 1000;opacity: 1;}.ace_composition_placeholder { color: transparent }.ace_composition_marker { border-bottom: 1px solid;position: absolute;border-radius: 0;margin-top: 1px;}[ace_nocontext=true] {transform: none!important;filter: none!important;clip-path: none!important;mask : none!important;contain: none!important;perspective: none!important;mix-blend-mode: initial!important;z-index: auto;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;height: 1000000px;contain: style size layout;}.ace_text-layer {font: inherit !important;position: absolute;height: 1000000px;width: 1000000px;contain: style size layout;}.ace_text-layer > .ace_line, .ace_text-layer > .ace_line_group {contain: style size layout;position: absolute;top: 0;left: 0;right: 0;}.ace_hidpi .ace_text-layer,.ace_hidpi .ace_gutter-layer,.ace_hidpi .ace_content,.ace_hidpi .ace_gutter {contain: strict;will-change: transform;}.ace_hidpi .ace_text-layer > .ace_line, .ace_hidpi .ace_text-layer > .ace_line_group {contain: strict;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_hasPlaceholder .ace_hidden-cursors .ace_cursor {opacity: 0;}.ace_smooth-blinking .ace_cursor {transition: opacity 0.18s;}.ace_animate-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: step-end;animation-name: blink-ace-animate;animation-iteration-count: infinite;}.ace_animate-blinking.ace_smooth-blinking .ace_cursor {animation-duration: 1000ms;animation-timing-function: ease-in-out;animation-name: blink-ace-animate-smooth;}@keyframes blink-ace-animate {from, to { opacity: 1; }60% { opacity: 0; }}@keyframes blink-ace-animate-smooth {from, to { opacity: 1; }45% { opacity: 1; }60% { opacity: 0; }85% { opacity: 0; }}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_error_bracket {position: absolute;border-bottom: 1px solid #DE5555;border-radius: 0;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;box-sizing: border-box;}.ace_line .ace_fold {box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_inline_button {border: 1px solid lightgray;display: inline-block;margin: -1px 8px;padding: 0 5px;pointer-events: auto;cursor: pointer;}.ace_inline_button:hover {border-color: gray;background: rgba(200,200,200,0.2);display: inline-block;pointer-events: auto;}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}.ace_mobile-menu {position: absolute;line-height: 1.5;border-radius: 4px;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;background: white;box-shadow: 1px 3px 2px grey;border: 1px solid #dcdcdc;color: black;}.ace_dark > .ace_mobile-menu {background: #333;color: #ccc;box-shadow: 1px 3px 2px grey;border: 1px solid #444;}.ace_mobile-button {padding: 2px;cursor: pointer;overflow: hidden;}.ace_mobile-button:hover {background-color: #eee;opacity:1;}.ace_mobile-button:active {background-color: #ddd;}.ace_placeholder {font-family: arial;transform: scale(0.9);transform-origin: left;white-space: pre;opacity: 0.7;margin: 0 10px;}
/*# sourceURL=ace/css/ace_editor.css */</style><meta http-equiv="origin-trial" content="Az520Inasey3TAyqLyojQa8MnmCALSEU29yQFW8dePZ7xQTvSt73pHazLFTK5f7SyLUJSo2uKLesEtEa9aUYcgMAAACPeyJvcmlnaW4iOiJodHRwczovL2dvb2dsZS5jb206NDQzIiwiZmVhdHVyZSI6IkRpc2FibGVUaGlyZFBhcnR5U3RvcmFnZVBhcnRpdGlvbmluZyIsImV4cGlyeSI6MTcyNTQwNzk5OSwiaXNTdWJkb21haW4iOnRydWUsImlzVGhpcmRQYXJ0eSI6dHJ1ZX0="><script type="text/javascript" async="" src="./DemoPrimev4_files/js"></script><script type="text/javascript" async="" src="./DemoPrimev4_files/js(1)"></script><script type="text/javascript" async="" src="./DemoPrimev4_files/recaptcha__en.js.download" crossorigin="anonymous" integrity="sha384-ToIRK/fCxk6HZidjy8su24Pn+8FsKiX4QnuO0AfQZBcsd0m8DMaqafsc91h4byqU"></script><script async="" src="./DemoPrimev4_files/gtm.js.download"></script><script async="" src="./DemoPrimev4_files/gtm.js.download"></script><script>(function (w, d, s, l, i) {
				w[l] = w[l] || [];
				w[l].push({ 'gtm.start': new Date().getTime(), event: 'gtm.js' });
				var f = d.getElementsByTagName(s)[0],
					j = d.createElement(s),
					dl = l != 'dataLayer' ? '&l=' + l : '';
				j.async = true;
				j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
				f.parentNode.insertBefore(j, f);
			})(window, document, 'script', 'dataLayer', 'GTM-W3NML658');</script><meta http-equiv="X-UA-Compatible" content="IE=edge"><meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"><meta property="og:url" content="https://www.jdoodle.com"><meta property="og:type" content="website"><meta property="og:title" content="JDoodle - Online Compiler, Editor for Java, C/C++, etc"><meta property="og:description" content="JDoodle is an Online Compiler, Editor, IDE  for Java, C, C++, PHP, Perl, Python, Ruby and many more.  You can run your programs on the fly online, and you can save and share them with others. Quick and Easy way to compile and run programs online."><meta property="og:image" content="https://www.jdoodle.com/assets/jdoodle-og.jpeg"><meta property="og:image:alt" content="JDoodle"><meta name="google-site-verification" content="UvObv0WXViGO2pEP8egoe3k1sXqHcsSeAfEEjnUyuXg"><meta name="msvalidate.01" content="93539EB8D681BD90594A81FCAF6560BC"><style type="text/css">svg:not(:root).svg-inline--fa {
  overflow: visible;
}

.svg-inline--fa {
  display: inline-block;
  font-size: inherit;
  height: 1em;
  overflow: visible;
  vertical-align: -0.125em;
}
.svg-inline--fa.fa-lg {
  vertical-align: -0.225em;
}
.svg-inline--fa.fa-w-1 {
  width: 0.0625em;
}
.svg-inline--fa.fa-w-2 {
  width: 0.125em;
}
.svg-inline--fa.fa-w-3 {
  width: 0.1875em;
}
.svg-inline--fa.fa-w-4 {
  width: 0.25em;
}
.svg-inline--fa.fa-w-5 {
  width: 0.3125em;
}
.svg-inline--fa.fa-w-6 {
  width: 0.375em;
}
.svg-inline--fa.fa-w-7 {
  width: 0.4375em;
}
.svg-inline--fa.fa-w-8 {
  width: 0.5em;
}
.svg-inline--fa.fa-w-9 {
  width: 0.5625em;
}
.svg-inline--fa.fa-w-10 {
  width: 0.625em;
}
.svg-inline--fa.fa-w-11 {
  width: 0.6875em;
}
.svg-inline--fa.fa-w-12 {
  width: 0.75em;
}
.svg-inline--fa.fa-w-13 {
  width: 0.8125em;
}
.svg-inline--fa.fa-w-14 {
  width: 0.875em;
}
.svg-inline--fa.fa-w-15 {
  width: 0.9375em;
}
.svg-inline--fa.fa-w-16 {
  width: 1em;
}
.svg-inline--fa.fa-w-17 {
  width: 1.0625em;
}
.svg-inline--fa.fa-w-18 {
  width: 1.125em;
}
.svg-inline--fa.fa-w-19 {
  width: 1.1875em;
}
.svg-inline--fa.fa-w-20 {
  width: 1.25em;
}
.svg-inline--fa.fa-pull-left {
  margin-right: 0.3em;
  width: auto;
}
.svg-inline--fa.fa-pull-right {
  margin-left: 0.3em;
  width: auto;
}
.svg-inline--fa.fa-border {
  height: 1.5em;
}
.svg-inline--fa.fa-li {
  width: 2em;
}
.svg-inline--fa.fa-fw {
  width: 1.25em;
}

.fa-layers svg.svg-inline--fa {
  bottom: 0;
  left: 0;
  margin: auto;
  position: absolute;
  right: 0;
  top: 0;
}

.fa-layers {
  display: inline-block;
  height: 1em;
  position: relative;
  text-align: center;
  vertical-align: -0.125em;
  width: 1em;
}
.fa-layers svg.svg-inline--fa {
  -webkit-transform-origin: center center;
          transform-origin: center center;
}

.fa-layers-counter, .fa-layers-text {
  display: inline-block;
  position: absolute;
  text-align: center;
}

.fa-layers-text {
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  -webkit-transform-origin: center center;
          transform-origin: center center;
}

.fa-layers-counter {
  background-color: #ff253a;
  border-radius: 1em;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #fff;
  height: 1.5em;
  line-height: 1;
  max-width: 5em;
  min-width: 1.5em;
  overflow: hidden;
  padding: 0.25em;
  right: 0;
  text-overflow: ellipsis;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top right;
          transform-origin: top right;
}

.fa-layers-bottom-right {
  bottom: 0;
  right: 0;
  top: auto;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: bottom right;
          transform-origin: bottom right;
}

.fa-layers-bottom-left {
  bottom: 0;
  left: 0;
  right: auto;
  top: auto;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: bottom left;
          transform-origin: bottom left;
}

.fa-layers-top-right {
  right: 0;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top right;
          transform-origin: top right;
}

.fa-layers-top-left {
  left: 0;
  right: auto;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top left;
          transform-origin: top left;
}

.fa-lg {
  font-size: 1.3333333333em;
  line-height: 0.75em;
  vertical-align: -0.0667em;
}

.fa-xs {
  font-size: 0.75em;
}

.fa-sm {
  font-size: 0.875em;
}

.fa-1x {
  font-size: 1em;
}

.fa-2x {
  font-size: 2em;
}

.fa-3x {
  font-size: 3em;
}

.fa-4x {
  font-size: 4em;
}

.fa-5x {
  font-size: 5em;
}

.fa-6x {
  font-size: 6em;
}

.fa-7x {
  font-size: 7em;
}

.fa-8x {
  font-size: 8em;
}

.fa-9x {
  font-size: 9em;
}

.fa-10x {
  font-size: 10em;
}

.fa-fw {
  text-align: center;
  width: 1.25em;
}

.fa-ul {
  list-style-type: none;
  margin-left: 2.5em;
  padding-left: 0;
}
.fa-ul > li {
  position: relative;
}

.fa-li {
  left: -2em;
  position: absolute;
  text-align: center;
  width: 2em;
  line-height: inherit;
}

.fa-border {
  border: solid 0.08em #eee;
  border-radius: 0.1em;
  padding: 0.2em 0.25em 0.15em;
}

.fa-pull-left {
  float: left;
}

.fa-pull-right {
  float: right;
}

.fa.fa-pull-left,
.fas.fa-pull-left,
.far.fa-pull-left,
.fal.fa-pull-left,
.fab.fa-pull-left {
  margin-right: 0.3em;
}
.fa.fa-pull-right,
.fas.fa-pull-right,
.far.fa-pull-right,
.fal.fa-pull-right,
.fab.fa-pull-right {
  margin-left: 0.3em;
}

.fa-spin {
  -webkit-animation: fa-spin 2s infinite linear;
          animation: fa-spin 2s infinite linear;
}

.fa-pulse {
  -webkit-animation: fa-spin 1s infinite steps(8);
          animation: fa-spin 1s infinite steps(8);
}

@-webkit-keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}

@keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
.fa-rotate-90 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=1)";
  -webkit-transform: rotate(90deg);
          transform: rotate(90deg);
}

.fa-rotate-180 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2)";
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}

.fa-rotate-270 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=3)";
  -webkit-transform: rotate(270deg);
          transform: rotate(270deg);
}

.fa-flip-horizontal {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=0, mirror=1)";
  -webkit-transform: scale(-1, 1);
          transform: scale(-1, 1);
}

.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(1, -1);
          transform: scale(1, -1);
}

.fa-flip-both, .fa-flip-horizontal.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(-1, -1);
          transform: scale(-1, -1);
}

:root .fa-rotate-90,
:root .fa-rotate-180,
:root .fa-rotate-270,
:root .fa-flip-horizontal,
:root .fa-flip-vertical,
:root .fa-flip-both {
  -webkit-filter: none;
          filter: none;
}

.fa-stack {
  display: inline-block;
  height: 2em;
  position: relative;
  width: 2.5em;
}

.fa-stack-1x,
.fa-stack-2x {
  bottom: 0;
  left: 0;
  margin: auto;
  position: absolute;
  right: 0;
  top: 0;
}

.svg-inline--fa.fa-stack-1x {
  height: 1em;
  width: 1.25em;
}
.svg-inline--fa.fa-stack-2x {
  height: 2em;
  width: 2.5em;
}

.fa-inverse {
  color: #fff;
}

.sr-only {
  border: 0;
  clip: rect(0, 0, 0, 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.sr-only-focusable:active, .sr-only-focusable:focus {
  clip: auto;
  height: auto;
  margin: 0;
  overflow: visible;
  position: static;
  width: auto;
}

.svg-inline--fa .fa-primary {
  fill: var(--fa-primary-color, currentColor);
  opacity: 1;
  opacity: var(--fa-primary-opacity, 1);
}

.svg-inline--fa .fa-secondary {
  fill: var(--fa-secondary-color, currentColor);
  opacity: 0.4;
  opacity: var(--fa-secondary-opacity, 0.4);
}

.svg-inline--fa.fa-swap-opacity .fa-primary {
  opacity: 0.4;
  opacity: var(--fa-secondary-opacity, 0.4);
}

.svg-inline--fa.fa-swap-opacity .fa-secondary {
  opacity: 1;
  opacity: var(--fa-primary-opacity, 1);
}

.svg-inline--fa mask .fa-primary,
.svg-inline--fa mask .fa-secondary {
  fill: black;
}

.fad.fa-inverse {
  color: #fff;
}</style><style type="text/css">svg:not(:root).svg-inline--fa {
  overflow: visible;
}

.svg-inline--fa {
  display: inline-block;
  font-size: inherit;
  height: 1em;
  overflow: visible;
  vertical-align: -0.125em;
}
.svg-inline--fa.fa-lg {
  vertical-align: -0.225em;
}
.svg-inline--fa.fa-w-1 {
  width: 0.0625em;
}
.svg-inline--fa.fa-w-2 {
  width: 0.125em;
}
.svg-inline--fa.fa-w-3 {
  width: 0.1875em;
}
.svg-inline--fa.fa-w-4 {
  width: 0.25em;
}
.svg-inline--fa.fa-w-5 {
  width: 0.3125em;
}
.svg-inline--fa.fa-w-6 {
  width: 0.375em;
}
.svg-inline--fa.fa-w-7 {
  width: 0.4375em;
}
.svg-inline--fa.fa-w-8 {
  width: 0.5em;
}
.svg-inline--fa.fa-w-9 {
  width: 0.5625em;
}
.svg-inline--fa.fa-w-10 {
  width: 0.625em;
}
.svg-inline--fa.fa-w-11 {
  width: 0.6875em;
}
.svg-inline--fa.fa-w-12 {
  width: 0.75em;
}
.svg-inline--fa.fa-w-13 {
  width: 0.8125em;
}
.svg-inline--fa.fa-w-14 {
  width: 0.875em;
}
.svg-inline--fa.fa-w-15 {
  width: 0.9375em;
}
.svg-inline--fa.fa-w-16 {
  width: 1em;
}
.svg-inline--fa.fa-w-17 {
  width: 1.0625em;
}
.svg-inline--fa.fa-w-18 {
  width: 1.125em;
}
.svg-inline--fa.fa-w-19 {
  width: 1.1875em;
}
.svg-inline--fa.fa-w-20 {
  width: 1.25em;
}
.svg-inline--fa.fa-pull-left {
  margin-right: 0.3em;
  width: auto;
}
.svg-inline--fa.fa-pull-right {
  margin-left: 0.3em;
  width: auto;
}
.svg-inline--fa.fa-border {
  height: 1.5em;
}
.svg-inline--fa.fa-li {
  width: 2em;
}
.svg-inline--fa.fa-fw {
  width: 1.25em;
}

.fa-layers svg.svg-inline--fa {
  bottom: 0;
  left: 0;
  margin: auto;
  position: absolute;
  right: 0;
  top: 0;
}

.fa-layers {
  display: inline-block;
  height: 1em;
  position: relative;
  text-align: center;
  vertical-align: -0.125em;
  width: 1em;
}
.fa-layers svg.svg-inline--fa {
  -webkit-transform-origin: center center;
          transform-origin: center center;
}

.fa-layers-counter, .fa-layers-text {
  display: inline-block;
  position: absolute;
  text-align: center;
}

.fa-layers-text {
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  -webkit-transform-origin: center center;
          transform-origin: center center;
}

.fa-layers-counter {
  background-color: #ff253a;
  border-radius: 1em;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #fff;
  height: 1.5em;
  line-height: 1;
  max-width: 5em;
  min-width: 1.5em;
  overflow: hidden;
  padding: 0.25em;
  right: 0;
  text-overflow: ellipsis;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top right;
          transform-origin: top right;
}

.fa-layers-bottom-right {
  bottom: 0;
  right: 0;
  top: auto;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: bottom right;
          transform-origin: bottom right;
}

.fa-layers-bottom-left {
  bottom: 0;
  left: 0;
  right: auto;
  top: auto;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: bottom left;
          transform-origin: bottom left;
}

.fa-layers-top-right {
  right: 0;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top right;
          transform-origin: top right;
}

.fa-layers-top-left {
  left: 0;
  right: auto;
  top: 0;
  -webkit-transform: scale(0.25);
          transform: scale(0.25);
  -webkit-transform-origin: top left;
          transform-origin: top left;
}

.fa-lg {
  font-size: 1.3333333333em;
  line-height: 0.75em;
  vertical-align: -0.0667em;
}

.fa-xs {
  font-size: 0.75em;
}

.fa-sm {
  font-size: 0.875em;
}

.fa-1x {
  font-size: 1em;
}

.fa-2x {
  font-size: 2em;
}

.fa-3x {
  font-size: 3em;
}

.fa-4x {
  font-size: 4em;
}

.fa-5x {
  font-size: 5em;
}

.fa-6x {
  font-size: 6em;
}

.fa-7x {
  font-size: 7em;
}

.fa-8x {
  font-size: 8em;
}

.fa-9x {
  font-size: 9em;
}

.fa-10x {
  font-size: 10em;
}

.fa-fw {
  text-align: center;
  width: 1.25em;
}

.fa-ul {
  list-style-type: none;
  margin-left: 2.5em;
  padding-left: 0;
}
.fa-ul > li {
  position: relative;
}

.fa-li {
  left: -2em;
  position: absolute;
  text-align: center;
  width: 2em;
  line-height: inherit;
}

.fa-border {
  border: solid 0.08em #eee;
  border-radius: 0.1em;
  padding: 0.2em 0.25em 0.15em;
}

.fa-pull-left {
  float: left;
}

.fa-pull-right {
  float: right;
}

.fa.fa-pull-left,
.fas.fa-pull-left,
.far.fa-pull-left,
.fal.fa-pull-left,
.fab.fa-pull-left {
  margin-right: 0.3em;
}
.fa.fa-pull-right,
.fas.fa-pull-right,
.far.fa-pull-right,
.fal.fa-pull-right,
.fab.fa-pull-right {
  margin-left: 0.3em;
}

.fa-spin {
  -webkit-animation: fa-spin 2s infinite linear;
          animation: fa-spin 2s infinite linear;
}

.fa-pulse {
  -webkit-animation: fa-spin 1s infinite steps(8);
          animation: fa-spin 1s infinite steps(8);
}

@-webkit-keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}

@keyframes fa-spin {
  0% {
    -webkit-transform: rotate(0deg);
            transform: rotate(0deg);
  }
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
.fa-rotate-90 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=1)";
  -webkit-transform: rotate(90deg);
          transform: rotate(90deg);
}

.fa-rotate-180 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2)";
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}

.fa-rotate-270 {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=3)";
  -webkit-transform: rotate(270deg);
          transform: rotate(270deg);
}

.fa-flip-horizontal {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=0, mirror=1)";
  -webkit-transform: scale(-1, 1);
          transform: scale(-1, 1);
}

.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(1, -1);
          transform: scale(1, -1);
}

.fa-flip-both, .fa-flip-horizontal.fa-flip-vertical {
  -ms-filter: "progid:DXImageTransform.Microsoft.BasicImage(rotation=2, mirror=1)";
  -webkit-transform: scale(-1, -1);
          transform: scale(-1, -1);
}

:root .fa-rotate-90,
:root .fa-rotate-180,
:root .fa-rotate-270,
:root .fa-flip-horizontal,
:root .fa-flip-vertical,
:root .fa-flip-both {
  -webkit-filter: none;
          filter: none;
}

.fa-stack {
  display: inline-block;
  height: 2em;
  position: relative;
  width: 2.5em;
}

.fa-stack-1x,
.fa-stack-2x {
  bottom: 0;
  left: 0;
  margin: auto;
  position: absolute;
  right: 0;
  top: 0;
}

.svg-inline--fa.fa-stack-1x {
  height: 1em;
  width: 1.25em;
}
.svg-inline--fa.fa-stack-2x {
  height: 2em;
  width: 2.5em;
}

.fa-inverse {
  color: #fff;
}

.sr-only {
  border: 0;
  clip: rect(0, 0, 0, 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.sr-only-focusable:active, .sr-only-focusable:focus {
  clip: auto;
  height: auto;
  margin: 0;
  overflow: visible;
  position: static;
  width: auto;
}

.svg-inline--fa .fa-primary {
  fill: var(--fa-primary-color, currentColor);
  opacity: 1;
  opacity: var(--fa-primary-opacity, 1);
}

.svg-inline--fa .fa-secondary {
  fill: var(--fa-secondary-color, currentColor);
  opacity: 0.4;
  opacity: var(--fa-secondary-opacity, 0.4);
}

.svg-inline--fa.fa-swap-opacity .fa-primary {
  opacity: 0.4;
  opacity: var(--fa-secondary-opacity, 0.4);
}

.svg-inline--fa.fa-swap-opacity .fa-secondary {
  opacity: 1;
  opacity: var(--fa-primary-opacity, 1);
}

.svg-inline--fa mask .fa-primary,
.svg-inline--fa mask .fa-secondary {
  fill: black;
}

.fad.fa-inverse {
  color: #fff;
}</style><link rel="icon" href="https://www.jdoodle.com/favicon.ico"><title>Online Java Compiler - Online Java Editor -  Java Code Online </title><script type="application/ld+json">{
				"@context": "http://schema.org",
				"@type": "SoftwareApplication",
				"name": "JDoodle - Online Compiler And Editor",
				"image": "https://www.jdoodle.com/assets/jdoodle-og.jpeg"
			}</script><link href="https://www.jdoodle.com/css/chunk-013f43e8.cdda525f.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-02b46608.b03a6554.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-04e31f42.a05dcb5d.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-05c303be.8c25d934.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-0644abab.a1227098.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-09dd67de.06f6e4e0.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-0aa683fe.418b1010.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-0ad54e6b.b203f09a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-0ca6c1a6.897263b2.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-0cee4bac.8a8d1b07.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-120224e8.5410b7d3.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-13a55499.9a64a201.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-17587b03.9a64a201.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-1a6ac814.cfbf0947.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-1e1a1a35.004fefc4.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-1e96650c.51383d13.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-20666855.a05dcb5d.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-20a09cce.a05dcb5d.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-22fd4cb6.164de2eb.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-2490f4d4.8f64bd2e.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-269af6fc.8e443cb8.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-269e2db6.d0364b7b.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-2721b2cd.a1aea183.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-28580e3d.f6f11826.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-28b59e02.ca562775.css" rel="prefetch"><link href="./DemoPrimev4_files/chunk-2abbf6ee.54e034bf.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-2c925f1b.33cb4131.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-2e1bb63e.994e3291.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-2f0ec536.84012ba7.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-30ef31e6.cea70340.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-30f1186e.136ca96a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-3424c40f.0575f358.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-3914adb1.038d72b9.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-3a76d7c3.9a64a201.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-3ad646d9.785eac55.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-3ccc8c05.cd250244.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-40eb75e9.785eac55.css" rel="prefetch"><link href="./DemoPrimev4_files/chunk-4678d92e.637f5e19.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-4fb28942.10549c41.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-500226b5.d1433658.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-5729535a.8b909010.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-5988f7ab.a05dcb5d.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-5a721849.f91fbfa9.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-5ad1a321.9ca1bfe1.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-5d6e4839.467687e6.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-6046507e.33cb4131.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-6064057d.362d822a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-62967296.0583fe4a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-68ba2c2c.049be0dc.css" rel="prefetch"><link href="./DemoPrimev4_files/chunk-6b1c6d56.582c48a0.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-6d512c99.bf7e4dff.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-6e8fc709.a2d72f79.css" rel="prefetch"><link href="./DemoPrimev4_files/chunk-70116070.fddecb7a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-7405bbdc.ad6e41ed.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-761a9e8e.e0b6b949.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-766c19c3.e51ca9e0.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-784d0bdd.06060476.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-7fa1da0e.1bb7a823.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-826bf68a.418b1010.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-8613a0a2.d56167ef.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-8f7598f0.feb37778.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-947d10b6.e4c01e41.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-a36ad958.b50ebec4.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-acb297a8.0a8f1d12.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-ae105ad8.b9260fc4.css" rel="prefetch"><link href="./DemoPrimev4_files/chunk-b01ce04e.c8af8263.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-ba524680.bca5419f.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-bab4d20a.0f23e30b.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-c1bcb044.db38340a.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-cfb0df56.38c79aad.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-dd13e594.33cb4131.css" rel="prefetch"><link href="https://www.jdoodle.com/css/chunk-f86d0456.4ada9718.css" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-013f43e8.bfe9e2f2.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-02b46608.23b543ae.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-04e31f42.f015dc95.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-05c303be.a5ee8095.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-0644abab.7eebac26.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-09dd67de.0af01ef0.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-0aa683fe.f0ae0f94.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-0ad54e6b.7c3f3f47.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-0ca6c1a6.0e176bab.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-0cee4bac.4d9501b4.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-120224e8.41df4f10.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-13a55499.80178055.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-17587b03.25a9e081.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-1a6ac814.13cfe70c.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-1e1a1a35.5bb6088f.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-1e96650c.c9eee704.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-20666855.0696dbc7.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-20a09cce.dcfa7a46.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-22fd4cb6.7d736c11.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2490f4d4.83264a46.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-251e2180.c441d4d7.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-269af6fc.51a06ad2.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-269e2db6.4f2168f7.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2721b2cd.b5b0225e.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-28580e3d.8f1fd79d.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-28b59e02.5d7a2863.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-2abbf6ee.b35d1629.js.download" rel="prefetch"><link href="./DemoPrimev4_files/chunk-2b7aad2e.7e5cfe46.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2c925f1b.577fd8f1.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2d0b1c06.f4e21858.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2e1bb63e.85e2c0ec.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-2f0ec536.8e30b898.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-30ef31e6.28da3d85.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-30f1186e.71c195fc.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-32b1d3de.0316180b.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-335a9904.d496f40c.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-3424c40f.1c9b915e.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-3914adb1.bb538c76.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-3a76d7c3.aedfe48c.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-3ad646d9.517041b9.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-3ccc8c05.48078595.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-40eb75e9.e56c4def.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-4678d92e.8c1c8799.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-4fb28942.801d7ae2.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-500226b5.8f21c86a.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-5729535a.aa6bd452.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-5988f7ab.5132c985.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-5a721849.8bdbc80e.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-5ad1a321.c292db7f.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-5b7cbdf4.77f16e41.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-5d6e4839.c926f7be.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-6046507e.30eeb243.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-6064057d.4cbb3a3a.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-62967296.bc4a8835.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-6793df2c.27f11bb9.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-68ba2c2c.bb76c380.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-6b1c6d56.24eae7a8.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-6d512c99.34572d58.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-6e8fc709.5f79eaaf.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-70116070.14d90143.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-7405bbdc.a098123f.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-761a9e8e.2c12bf75.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-766c19c3.fcea07da.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-784d0bdd.781d7211.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-7db688a6.9f3b8cb0.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-7fa1da0e.dd77164e.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-826bf68a.b6a2d281.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-8613a0a2.3c0eee7b.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-8f7598f0.6d62937b.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-947d10b6.e13343c9.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-a36ad958.0cea9698.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-acb297a8.7e61e1a9.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-ae105ad8.9d20136a.js" rel="prefetch"><link href="./DemoPrimev4_files/chunk-b01ce04e.4c107e3e.js.download" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-ba524680.451e18a1.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-bab4d20a.cc712d0a.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-c1bcb044.ba819a06.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-cfb0df56.1ec20c1b.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-dd13e594.75a00bfb.js" rel="prefetch"><link href="https://www.jdoodle.com/js/chunk-f86d0456.5f1b3f1f.js" rel="prefetch"><link href="./DemoPrimev4_files/app.52ae3bed.css" rel="preload" as="style"><link href="./DemoPrimev4_files/chunk-vendors.252da19f.css" rel="preload" as="style"><link href="./DemoPrimev4_files/app.374a512a.js.download" rel="preload" as="script"><link href="./DemoPrimev4_files/chunk-vendors.ccd68b53.js.download" rel="preload" as="script"><link href="./DemoPrimev4_files/chunk-vendors.252da19f.css" rel="stylesheet"><link href="./DemoPrimev4_files/app.52ae3bed.css" rel="stylesheet"><script charset="utf-8" src="./DemoPrimev4_files/chunk-32b1d3de.0316180b.js.download"></script><link rel="stylesheet" type="text/css" href="./DemoPrimev4_files/chunk-4678d92e.637f5e19.css"><script charset="utf-8" src="./DemoPrimev4_files/chunk-4678d92e.8c1c8799.js.download"></script><link rel="stylesheet" type="text/css" href="./DemoPrimev4_files/chunk-70116070.fddecb7a.css"><script charset="utf-8" src="./DemoPrimev4_files/chunk-70116070.14d90143.js.download"></script><link rel="stylesheet" type="text/css" href="./DemoPrimev4_files/chunk-6b1c6d56.582c48a0.css"><script charset="utf-8" src="./DemoPrimev4_files/chunk-6b1c6d56.24eae7a8.js.download"></script><script charset="utf-8" src="./DemoPrimev4_files/chunk-2b7aad2e.7e5cfe46.js.download"></script><link rel="stylesheet" type="text/css" href="./DemoPrimev4_files/chunk-2abbf6ee.54e034bf.css"><script charset="utf-8" src="./DemoPrimev4_files/chunk-2abbf6ee.b35d1629.js.download"></script><script charset="utf-8" src="./DemoPrimev4_files/chunk-5b7cbdf4.77f16e41.js.download"></script><link rel="stylesheet" type="text/css" href="./DemoPrimev4_files/chunk-b01ce04e.c8af8263.css"><script charset="utf-8" src="./DemoPrimev4_files/chunk-b01ce04e.4c107e3e.js.download"></script><style type="text/css">.Cookie{position:fixed;overflow:hidden;box-sizing:border-box;z-index:9999;width:100%;display:flex;justify-content:space-between;align-items:baseline;flex-direction:column}.Cookie>*{margin:.9375rem 0;align-self:center}@media screen and (min-width: 48rem){.Cookie{flex-flow:row}.Cookie>*{margin:0}}.Cookie--top{top:0;left:0;right:0}.Cookie--bottom{bottom:0;left:0;right:0}.Cookie__buttons{display:flex;flex-direction:column}.Cookie__buttons>*{margin:.3125rem 0}@media screen and (min-width: 48rem){.Cookie__buttons{flex-direction:row}.Cookie__buttons>*{margin:0 .9375rem}}.Cookie__button{cursor:pointer;align-self:center;white-space:nowrap}.Cookie__declineButton{cursor:pointer;align-self:center;white-space:nowrap}.Cookie--base{background:#F1F1F1;color:#232323;padding:1.250em}.Cookie--base .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--base .Cookie__button:hover{background:#7ebf36}.Cookie--base .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#727272;border-radius:0;border:0;font-size:1em}.Cookie--base .Cookie__button--decline:hover{background:#cbcbcb}.Cookie--base--rounded{background:#F1F1F1;color:#232323;padding:1.250em}.Cookie--base--rounded .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--base--rounded .Cookie__button:hover{background:#7ebf36}.Cookie--base--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#727272;border-radius:20px;border:0;font-size:1em}.Cookie--base--rounded .Cookie__button--decline:hover{background:#cbcbcb}.Cookie--blood-orange{background:#424851;color:#fff;padding:1.250em}.Cookie--blood-orange .Cookie__button{background:#E76A68;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--blood-orange .Cookie__button:hover{background:#e03f3c}.Cookie--blood-orange .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:0;border:0;font-size:1em}.Cookie--blood-orange .Cookie__button--decline:hover{background:#202327}.Cookie--blood-orange--rounded{background:#424851;color:#fff;padding:1.250em}.Cookie--blood-orange--rounded .Cookie__button{background:#E76A68;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--blood-orange--rounded .Cookie__button:hover{background:#e03f3c}.Cookie--blood-orange--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:20px;border:0;font-size:1em}.Cookie--blood-orange--rounded .Cookie__button--decline:hover{background:#202327}.Cookie--dark-lime{background:#424851;color:#fff;padding:1.250em}.Cookie--dark-lime .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--dark-lime .Cookie__button:hover{background:#7ebf36}.Cookie--dark-lime .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:0;border:0;font-size:1em}.Cookie--dark-lime .Cookie__button--decline:hover{background:#202327}.Cookie--dark-lime--rounded{background:#424851;color:#fff;padding:1.250em}.Cookie--dark-lime--rounded .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--dark-lime--rounded .Cookie__button:hover{background:#7ebf36}.Cookie--dark-lime--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:20px;border:0;font-size:1em}.Cookie--dark-lime--rounded .Cookie__button--decline:hover{background:#202327}.Cookie--royal{background:#FBC227;color:#232323;padding:1.250em}.Cookie--royal .Cookie__button{background:#726CEA;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--royal .Cookie__button:hover{background:#473fe4}.Cookie--royal .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#221901;border-radius:0;border:0;font-size:1em}.Cookie--royal .Cookie__button--decline:hover{background:#d29a04}.Cookie--royal--rounded{background:#FBC227;color:#232323;padding:1.250em}.Cookie--royal--rounded .Cookie__button{background:#726CEA;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--royal--rounded .Cookie__button:hover{background:#473fe4}.Cookie--royal--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#221901;border-radius:20px;border:0;font-size:1em}.Cookie--royal--rounded .Cookie__button--decline:hover{background:#d29a04}.slideFromTop-enter,.slideFromTop-leave-to{transform:translate(0px, -12.5em)}.slideFromTop-enter-to,.slideFromTop-leave{transform:translate(0px, 0px)}.slideFromBottom-enter,.slideFromBottom-leave-to{transform:translate(0px, 12.5em)}.slideFromBottom-enter-to,.slideFromBottom-leave{transform:translate(0px, 0px)}.slideFromBottom-enter-active,.slideFromBottom-leave-active,.slideFromTop-enter-active,.slideFromTop-leave-active{transition:transform .4s ease-in}.fade-enter-active,.fade-leave-active{transition:opacity .5s}.fade-enter,.fade-leave-to{opacity:0}
</style><meta name="description" content="Online Java Compiler - Online Java Editor - Online Java IDE -  Java Coding Online - Online Java Runner - Share Save Java online" data-vue-router-controlled=""><meta name="keywords" content="Online Java Compiler - Online Java Editor - Online Java IDE - Java Coding Online - Online Java Runner -  Share Save Java online" data-vue-router-controlled=""><style type="text/css">.Cookie{position:fixed;overflow:hidden;box-sizing:border-box;z-index:9999;width:100%;display:flex;justify-content:space-between;align-items:baseline;flex-direction:column}.Cookie>*{margin:.9375rem 0;align-self:center}@media screen and (min-width: 48rem){.Cookie{flex-flow:row}.Cookie>*{margin:0}}.Cookie--top{top:0;left:0;right:0}.Cookie--bottom{bottom:0;left:0;right:0}.Cookie__buttons{display:flex;flex-direction:column}.Cookie__buttons>*{margin:.3125rem 0}@media screen and (min-width: 48rem){.Cookie__buttons{flex-direction:row}.Cookie__buttons>*{margin:0 .9375rem}}.Cookie__button{cursor:pointer;align-self:center;white-space:nowrap}.Cookie__declineButton{cursor:pointer;align-self:center;white-space:nowrap}.Cookie--base{background:#F1F1F1;color:#232323;padding:1.250em}.Cookie--base .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--base .Cookie__button:hover{background:#7ebf36}.Cookie--base .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#727272;border-radius:0;border:0;font-size:1em}.Cookie--base .Cookie__button--decline:hover{background:#cbcbcb}.Cookie--base--rounded{background:#F1F1F1;color:#232323;padding:1.250em}.Cookie--base--rounded .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--base--rounded .Cookie__button:hover{background:#7ebf36}.Cookie--base--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#727272;border-radius:20px;border:0;font-size:1em}.Cookie--base--rounded .Cookie__button--decline:hover{background:#cbcbcb}.Cookie--blood-orange{background:#424851;color:#fff;padding:1.250em}.Cookie--blood-orange .Cookie__button{background:#E76A68;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--blood-orange .Cookie__button:hover{background:#e03f3c}.Cookie--blood-orange .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:0;border:0;font-size:1em}.Cookie--blood-orange .Cookie__button--decline:hover{background:#202327}.Cookie--blood-orange--rounded{background:#424851;color:#fff;padding:1.250em}.Cookie--blood-orange--rounded .Cookie__button{background:#E76A68;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--blood-orange--rounded .Cookie__button:hover{background:#e03f3c}.Cookie--blood-orange--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:20px;border:0;font-size:1em}.Cookie--blood-orange--rounded .Cookie__button--decline:hover{background:#202327}.Cookie--dark-lime{background:#424851;color:#fff;padding:1.250em}.Cookie--dark-lime .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--dark-lime .Cookie__button:hover{background:#7ebf36}.Cookie--dark-lime .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:0;border:0;font-size:1em}.Cookie--dark-lime .Cookie__button--decline:hover{background:#202327}.Cookie--dark-lime--rounded{background:#424851;color:#fff;padding:1.250em}.Cookie--dark-lime--rounded .Cookie__button{background:#97D058;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--dark-lime--rounded .Cookie__button:hover{background:#7ebf36}.Cookie--dark-lime--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#000;border-radius:20px;border:0;font-size:1em}.Cookie--dark-lime--rounded .Cookie__button--decline:hover{background:#202327}.Cookie--royal{background:#FBC227;color:#232323;padding:1.250em}.Cookie--royal .Cookie__button{background:#726CEA;padding:0.625em 3.125em;color:#fff;border-radius:0;border:0;font-size:1em}.Cookie--royal .Cookie__button:hover{background:#473fe4}.Cookie--royal .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#221901;border-radius:0;border:0;font-size:1em}.Cookie--royal .Cookie__button--decline:hover{background:#d29a04}.Cookie--royal--rounded{background:#FBC227;color:#232323;padding:1.250em}.Cookie--royal--rounded .Cookie__button{background:#726CEA;padding:0.625em 3.125em;color:#fff;border-radius:20px;border:0;font-size:1em}.Cookie--royal--rounded .Cookie__button:hover{background:#473fe4}.Cookie--royal--rounded .Cookie__button--decline{background:transparent;padding:0.625em 3.125em;color:#221901;border-radius:20px;border:0;font-size:1em}.Cookie--royal--rounded .Cookie__button--decline:hover{background:#d29a04}.slideFromTop-enter,.slideFromTop-leave-to{transform:translate(0px, -12.5em)}.slideFromTop-enter-to,.slideFromTop-leave{transform:translate(0px, 0px)}.slideFromBottom-enter,.slideFromBottom-leave-to{transform:translate(0px, 12.5em)}.slideFromBottom-enter-to,.slideFromBottom-leave{transform:translate(0px, 0px)}.slideFromBottom-enter-active,.slideFromBottom-leave-active,.slideFromTop-enter-active,.slideFromTop-leave-active{transition:transform .4s ease-in}.fade-enter-active,.fade-leave-active{transition:opacity .5s}.fade-enter,.fade-leave-to{opacity:0}
</style><script src="./DemoPrimev4_files/theme-xcode.js.download"></script><script src="./DemoPrimev4_files/mode-java.js.download"></script></head><body><noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-W3NML658" height=0 width=0 style="display: none; visibility: hidden"></iframe></noscript><noscript><strong>We're sorry but jdoodle-spa doesn't work properly without JavaScript enabled. Please enable it to continue.</strong></noscript><div id="app" class="main-page"><div class="nav_bar" style="background-color: rgb(248, 249, 248);"><a href="https://www.jdoodle.com/" class="router-link-active"><div class="logo"><img alt="logo" src="data:image/png;base64,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"></div></a><!----><div class="right_section"><div class="desktop_product"><div class="desktop_product_title"><a>Products</a><img src="./DemoPrimev4_files/dropDown.a1ef5dfb.svg" class="arrow_icon"><!----></div><!----></div><a href="https://docs.jdoodle.com/" target="_blank">Docs</a><div><button data-v-bd847904="" class="my_button">Log In</button></div><!----></div><div class="burger"><!----><img src="./DemoPrimev4_files/burger.d059f68e.svg"><!----></div><!----><!----></div><div class="app-wrap"><div data-v-51632180="" class="home-container"><div data-v-51632180="" class="has-text-centered title-section is-marginless"><h1 data-v-51632180="" class="title is-marginless custom-grey"><span data-v-51632180="">Online</span> Java <span data-v-51632180="">Compiler</span><span data-v-51632180=""> IDE</span></h1><!----></div><div data-v-51632180="" class="has-text-centered ide-info-message custom-grey">
      For Multiple Files, Custom Library and File Read/Write, use our new -
      <a data-v-51632180="" href="https://www.jdoodle.com/online-java-compiler-ide/" class="is-underlined custom-grey">Advanced Java IDE</a></div><!----><!----><div data-v-51632180="" class="box no-border-print code-editor-box"><div data-v-51632180="" id="ide-left" class="ide-left"><!----><div data-v-51632180="" class="is-flex ide-part is-mobile"><!----><div data-v-51632180="" id="ide-code" class="split is-marginless is-paddingless"><!----><div data-v-51632180="" class=""><!----><div data-v-51632180="" class=""><div data-v-51632180="" id="code" class="code-editor no-border-print ace_editor ace-xcode ace_focus" style="font-size: 12px; height: 291.143px;" draggable="false"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; font-size: 1px; height: 1px; width: 1px; top: 14px; left: 51px;"></textarea><div class="ace_gutter" aria-hidden="true" style="display: block; left: 0px; width: 47px;"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="height: 1e+06px; top: 0px; left: 0px; width: 47px;"><div class="ace_gutter-active-line ace_gutter-cell " style="height: 14px; top: 0px;">1<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 14px;">2<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 28px;">3<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 42px;">4<span style="display: none; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 56px;">5<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 70px;">6<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 84px;">7<span style="display: none; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 98px;">8<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 112px;">9<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 126px;">10<span class="ace_fold-widget ace_start ace_open" style="display: none; height: 15px;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 140px;">11<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 154px;">12<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 168px;">13<span style="display: none; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 182px;">14<span style="display: none; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 196px;">15<span style="display: inline-block; height: 14px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 210px;">16<span class="ace_fold-widget ace_start ace_open" style="display: none; height: 15px;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 224px;">17<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 238px;">18<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 252px;">19<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 266px;">20<span style="display: none; height: 15px;" class="ace_fold-widget ace_start ace_open"></span></div></div></div><div class="ace_scroller" style="line-height: 14px; left: 47px; right: 0px; bottom: 0px; cursor: default;"><div class="ace_content" style="top: 0px; left: 0px; width: 799px; height: 318px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 532px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_selection ace_br1 ace_start" style="height: 14px; right: 0px; top: 0px; left: 4px;"></div><div class="ace_selection ace_br12" style="height: 14px; width: 6.59766px; top: 266px; left: 4px;"></div><div class="ace_selection" style="height: 252px; right: 0px; top: 14px; left: 4px;"></div></div><div class="ace_layer ace_text-layer" style="height: 1e+06px; margin: 0px 4px; top: 0px; left: 0px;"><div class="ace_line" style="height: 14px; top: 0px;"><span class="ace_keyword">public</span> <span class="ace_keyword">class</span> <span class="ace_identifier">Demoprimev4</span>{</div><div class="ace_line" style="height: 14px; top: 14px;">    <span class="ace_keyword">public</span> <span class="ace_keyword">static</span> <span class="ace_keyword">void</span> <span class="ace_identifier">main</span>(<span class="ace_support ace_function">String</span> <span class="ace_identifier">args</span>[]){</div><div class="ace_line" style="height: 14px; top: 28px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">int</span> <span class="ace_identifier">num</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">50</span>,<span class="ace_identifier">flag</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">0</span>,<span class="ace_identifier">i</span>,<span class="ace_identifier">j</span>,<span class="ace_identifier">n</span>;</div><div class="ace_line" style="height: 14px; top: 42px;"><span class="ace_indent-guide">    </span>    <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_string">"The list of prime number 2 to 50 is "</span><span class="ace_keyword ace_operator">+</span><span class="ace_identifier">num</span>);</div><div class="ace_line" style="height: 14px; top: 56px;"><span class="ace_indent-guide">    </span>    <span class="ace_keyword">for</span>(<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">2</span>;<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">&lt;=</span><span class="ace_identifier">num</span>;<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">++</span>){</div><div class="ace_line" style="height: 14px; top: 70px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">flag</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">0</span>;</div><div class="ace_line" style="height: 14px; top: 84px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">for</span>(<span class="ace_identifier">j</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">2</span>;<span class="ace_identifier">j</span><span class="ace_keyword ace_operator">&lt;=</span><span class="ace_identifier">i</span>/<span class="ace_constant ace_numeric">2</span>;<span class="ace_identifier">j</span><span class="ace_keyword ace_operator">++</span>)</div><div class="ace_line" style="height: 14px; top: 98px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 14px; top: 112px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">if</span>(<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">%</span><span class="ace_identifier">j</span><span class="ace_keyword ace_operator">==</span><span class="ace_constant ace_numeric">0</span>){</div><div class="ace_line" style="height: 14px; top: 126px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_identifier">flag</span><span class="ace_keyword ace_operator">=</span><span class="ace_constant ace_numeric">1</span>;</div><div class="ace_line" style="height: 14px; top: 140px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">break</span>;</div><div class="ace_line" style="height: 14px; top: 154px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 14px; top: 168px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 14px; top: 182px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_keyword">if</span>(<span class="ace_identifier">flag</span><span class="ace_keyword ace_operator">==</span><span class="ace_constant ace_numeric">0</span>)</div><div class="ace_line" style="height: 14px; top: 196px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    {</div><div class="ace_line" style="height: 14px; top: 210px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    <span class="ace_support ace_function">System</span>.<span class="ace_identifier">out</span>.<span class="ace_identifier">println</span>(<span class="ace_identifier">i</span><span class="ace_keyword ace_operator">+</span><span class="ace_string">""</span>);</div><div class="ace_line" style="height: 14px; top: 224px;"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 14px; top: 238px;"><span class="ace_indent-guide">    </span>    }</div><div class="ace_line" style="height: 14px; top: 252px;">    }</div><div class="ace_line" style="height: 14px; top: 266px;">}</div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_animate-blinking"><div class="ace_cursor" style="display: block; top: 0px; left: 4px; width: 7px; height: 14px; animation-duration: 1000ms;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="width: 22px; bottom: 0px; display: none;"><div class="ace_scrollbar-inner" style="width: 22px; height: 280px;">&nbsp;</div></div><div class="ace_scrollbar ace_scrollbar-h" style="height: 22px; left: 47px; right: 0px; display: none;"><div class="ace_scrollbar-inner" style="height: 22px; width: 799px;">&nbsp;</div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">הההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההה</div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; font-optical-sizing: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div></div></div></div></div></div><div data-v-51632180="" id="ide-right" class="ide-right"><section data-v-51632180="" class="accordions"><article data-v-51632180="" class="accordion is-active"><div data-v-51632180="" class="accordion-header toggle background-grey-light has-text-weight-semibold"><p data-v-51632180=""><svg data-v-51632180="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="chevron-down" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-chevron-down fa-w-14"><path data-v-51632180="" fill="currentColor" d="M207.029 381.476L12.686 187.132c-9.373-9.373-9.373-24.569 0-33.941l22.667-22.667c9.357-9.357 24.522-9.375 33.901-.04L224 284.505l154.745-154.021c9.379-9.335 24.544-9.317 33.901.04l22.667 22.667c9.373 9.373 9.373 24.569 0 33.941L240.971 381.476c-9.373 9.372-24.569 9.372-33.942 0z" class=""></path></svg>&nbsp;&nbsp;&nbsp;Execute Mode, Version, Inputs &amp; Arguments</p></div><div data-v-51632180="" class="accordion-body custom-grey"><div data-v-51632180="" class="accordion-content is-paddingless"><div data-v-51632180="" class="columns is-multiline options-section is-marginless padding-left-none"><div data-v-51632180="" class="column columns is-multiline left-column is-marginless padding-left-none is-print-12 is-6"><div data-v-51632180="" class="column is-hidden-print is-12"><div data-v-51632180="" class="version-interactive-section is-mobile level"><div data-v-51632180="" class="has-text-centered level-left"><div data-v-51632180="" class="field is-narrow"><div data-v-51632180="" class="select is-rounded is-small has-text-weight-bold version-dropdown"><select data-v-51632180=""><option data-v-51632180="" value="0">
                                  JDK 1.8.0_66
                                </option><option data-v-51632180="" value="1">
                                  JDK 9.0.1
                                </option><option data-v-51632180="" value="2">
                                  JDK 10.0.1
                                </option><option data-v-51632180="" value="3">
                                  JDK 11.0.4
                                </option><option data-v-51632180="" value="4">
                                  JDK 17.0.1
                                </option></select></div></div></div><div data-v-51632180="" class="field has-text-centered level-right"><input data-v-51632180="" id="interactiveMode" type="checkbox" name="interactiveMode" class="switch has-text-white"><label data-v-51632180="" for="interactiveMode" class="ide-title has-text-weight-semibold">Interactive</label></div></div></div><div data-v-51632180="" class="column padding-left-none is-print-12 is-12"><div data-v-51632180="" class="column is-12 is-print-12"><div data-v-51632180="" class="has-text-weight-semibold ide-title">CommandLine Arguments</div><div data-v-51632180="" class="control"><input data-v-51632180="" type="text" name="arguments" autocomplete="off" class="input"></div></div></div></div><div data-v-51632180="" class="column is-6 is-print-12" style=""><div data-v-51632180="" class="has-text-weight-semibold ide-title">Stdin Inputs</div><div data-v-51632180="" class="control"><textarea data-v-51632180="" rows="2" name="stdin" class="textarea"></textarea></div></div></div></div></div></article></section><div data-v-51632180="" class="level execute-section is-hidden-print"><div data-v-51632180="" class="level-item"><div data-v-51632180="" class="field is-grouped"><p data-v-51632180="" class="control"><button data-v-51632180="" class="button is-info has-text-white has-text-weight-bold"><span data-v-51632180="" style=""><svg data-v-51632180="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="play" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-play fa-w-14"><path data-v-51632180="" fill="currentColor" d="M424.4 214.7L72.4 6.6C43.8-10.3 0 6.1 0 47.9V464c0 37.5 40.7 60.1 72.4 41.3l352-208c31.4-18.5 31.5-64.1 0-82.6z" class=""></path></svg>&nbsp;&nbsp;&nbsp;Execute</span><!----></button></p><div data-v-51632180="" id="ideContainer" data-size="invisible" data-sitekey="6LfPlOsUAAAAAIALEFUM1022nNwsyWjpATeuYMdi" data-badge="inline" class="g-recaptcha is-hidden-print captcha-box"><div class="grecaptcha-badge" data-style="inline" style="width: 256px; height: 60px; box-shadow: gray 0px 0px 5px;"><div class="grecaptcha-logo"><iframe title="reCAPTCHA" src="./DemoPrimev4_files/anchor.html" width="256" height="60" role="presentation" name="a-ukuq9fitxocl" frameborder="0" scrolling="no" sandbox="allow-forms allow-popups allow-same-origin allow-scripts allow-top-navigation allow-modals allow-popups-to-escape-sandbox"></iframe></div><div class="grecaptcha-error"></div><textarea id="g-recaptcha-response" name="g-recaptcha-response" class="g-recaptcha-response" style="width: 250px; height: 40px; border: 1px solid rgb(193, 193, 193); margin: 10px 25px; padding: 0px; resize: none; display: none;"></textarea></div><iframe style="display: none;" src="./DemoPrimev4_files/saved_resource.html"></iframe></div><!----><!----><p data-v-51632180="" class="control"><label data-v-51632180="" id="upload-button" class="button execute-button"><input data-v-51632180="" type="file" name="file" title="" class="file-input upload-pointer"><svg data-v-51632180="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="file-upload" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512" class="svg-inline--fa fa-file-upload fa-w-12"><path data-v-51632180="" fill="currentColor" d="M224 136V0H24C10.7 0 0 10.7 0 24v464c0 13.3 10.7 24 24 24h336c13.3 0 24-10.7 24-24V160H248c-13.2 0-24-10.8-24-24zm65.18 216.01H224v80c0 8.84-7.16 16-16 16h-32c-8.84 0-16-7.16-16-16v-80H94.82c-14.28 0-21.41-17.29-11.27-27.36l96.42-95.7c6.65-6.61 17.39-6.61 24.04 0l96.42 95.7c10.15 10.07 3.03 27.36-11.25 27.36zM377 105L279.1 7c-4.5-4.5-10.6-7-17-7H256v128h128v-6.1c0-6.3-2.5-12.4-7-16.9z" class=""></path></svg></label></p><p data-v-51632180="" class="control"><button data-v-51632180="" class="button has-text-dark has-text-weight-bold"><svg data-v-51632180="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="ellipsis-h" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="svg-inline--fa fa-ellipsis-h fa-w-16"><path data-v-51632180="" fill="currentColor" d="M328 256c0 39.8-32.2 72-72 72s-72-32.2-72-72 32.2-72 72-72 72 32.2 72 72zm104-72c-39.8 0-72 32.2-72 72s32.2 72 72 72 72-32.2 72-72-32.2-72-72-72zm-352 0c-39.8 0-72 32.2-72 72s32.2 72 72 72 72-32.2 72-72-32.2-72-72-72z" class=""></path></svg></button></p><p data-v-51632180="" class="control is-hidden-mobile"><button data-v-51632180="" class="button has-text-dark has-text-weight-bold"><svg data-v-51632180="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="expand" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-expand fa-w-14"><path data-v-51632180="" fill="currentColor" d="M0 180V56c0-13.3 10.7-24 24-24h124c6.6 0 12 5.4 12 12v40c0 6.6-5.4 12-12 12H64v84c0 6.6-5.4 12-12 12H12c-6.6 0-12-5.4-12-12zM288 44v40c0 6.6 5.4 12 12 12h84v84c0 6.6 5.4 12 12 12h40c6.6 0 12-5.4 12-12V56c0-13.3-10.7-24-24-24H300c-6.6 0-12 5.4-12 12zm148 276h-40c-6.6 0-12 5.4-12 12v84h-84c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h124c13.3 0 24-10.7 24-24V332c0-6.6-5.4-12-12-12zM160 468v-40c0-6.6-5.4-12-12-12H64v-84c0-6.6-5.4-12-12-12H12c-6.6 0-12 5.4-12 12v124c0 13.3 10.7 24 24 24h124c6.6 0 12-5.4 12-12z" class=""></path></svg><!----></button></p></div></div></div><div data-v-51632180="" class="upload-message has-text-centered" style="display: none;">
          
        </div><div data-v-62a83e41="" data-v-51632180="" class="has-text-centered error-box" style="display: none;"><svg data-v-62a83e41="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="exclamation-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="is-size-5 svg-inline--fa fa-exclamation-circle fa-w-16 has-text-danger"><path data-v-62a83e41="" fill="currentColor" d="M504 256c0 136.997-111.043 248-248 248S8 392.997 8 256C8 119.083 119.043 8 256 8s248 111.083 248 248zm-248 50c-25.405 0-46 20.595-46 46s20.595 46 46 46 46-20.595 46-46-20.595-46-46-46zm-43.673-165.346l7.418 136c.347 6.364 5.609 11.346 11.982 11.346h48.546c6.373 0 11.635-4.982 11.982-11.346l7.418-136c.375-6.874-5.098-12.654-11.982-12.654h-63.383c-6.884 0-12.356 5.78-11.981 12.654z" class=""></path></svg><span data-v-62a83e41="" class="has-text-weight-bold error-message">
        
  </span></div><div data-v-51632180="" class="has-text-weight-semibold ide-title">Result</div><div data-v-51632180="" class="execute-time level is-mobile is-marginless" style=""><div data-v-51632180="" class="level-left is-marginless is-paddingless" style=""><span data-v-51632180="">CPU Time: 0.11 sec(s), Memory: 33436 kilobyte(s)</span></div><div data-v-51632180="" class="is-marginless is-paddingless level-right"><span data-v-51632180="">compiled and&nbsp;</span>executed in 0.73 sec(s)</div></div><div data-v-51632180=""><div data-v-51632180="" id="output" class="code-editor no-border-print ace_editor ace-xcode" style="height: 289.143px;"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; font-size: 1px; height: 1px; width: 1px; top: 146px; left: 33px;"></textarea><div class="ace_gutter" aria-hidden="true" style="display: none; left: 0px; width: 47px;"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="height: 1e+06px; top: 20px; left: 0px; width: 47px;"><div class="ace_gutter-cell " style="height: 14px; top: 0px;">1<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 14px;">2<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 28px;">3<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 42px;">4<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 56px;">5<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 70px;">6<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 84px;">7<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 98px;">8<span style="display: none;"></span></div><div class="ace_gutter-active-line ace_gutter-cell " style="height: 14px; top: 112px;">9<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 126px;">10<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 140px;">11<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 154px;">12<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 168px;">13<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 182px;">14<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 196px;">15<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 210px;">16<span style="display: none;"></span></div><div class="ace_gutter-cell " style="height: 14px; top: 224px;">17<span style="display: none;"></span></div></div></div><div class="ace_scroller" style="line-height: 14px; left: 0px; right: 0px; bottom: 0px;"><div class="ace_content" style="top: 20px; left: 0px; width: 846px; height: 316px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 548px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_active-line" style="height: 14px; top: 112px; left: 0px; right: 0px;"></div></div><div class="ace_layer ace_text-layer" style="height: 1e+06px; margin: 0px 20px; top: 0px; left: 0px;"><div class="ace_line" style="height: 14px; top: 0px;">The list of prime number 2 to 50 is 50</div><div class="ace_line" style="height: 14px; top: 14px;">2</div><div class="ace_line" style="height: 14px; top: 28px;">3</div><div class="ace_line" style="height: 14px; top: 42px;">5</div><div class="ace_line" style="height: 14px; top: 56px;">7</div><div class="ace_line" style="height: 14px; top: 70px;">11</div><div class="ace_line" style="height: 14px; top: 84px;">13</div><div class="ace_line" style="height: 14px; top: 98px;">17</div><div class="ace_line" style="height: 14px; top: 112px;">19</div><div class="ace_line" style="height: 14px; top: 126px;">23</div><div class="ace_line" style="height: 14px; top: 140px;">29</div><div class="ace_line" style="height: 14px; top: 154px;">31</div><div class="ace_line" style="height: 14px; top: 168px;">37</div><div class="ace_line" style="height: 14px; top: 182px;">41</div><div class="ace_line" style="height: 14px; top: 196px;">43</div><div class="ace_line" style="height: 14px; top: 210px;">47</div><div class="ace_line" style="height: 14px; top: 224px;"></div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_hidden-cursors"><div class="ace_cursor" style="display: block; top: 112px; left: 33px; width: 7px; height: 14px; animation-duration: 1000ms;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="display: none; width: 22px; bottom: 0px;"><div class="ace_scrollbar-inner" style="width: 22px; height: 278px;">&nbsp;</div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 22px; left: 0px; right: 0px;"><div class="ace_scrollbar-inner" style="height: 22px; width: 846px;">&nbsp;</div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">הההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההההה</div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; font-optical-sizing: inherit; font-kerning: inherit; font-feature-settings: inherit; font-variation-settings: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div></div><!----><!----></div><div data-v-51632180="" class="has-text-grey-dark ide-info-message advance-ide-hint"><div data-v-51632180="">Note: Please check <a data-v-51632180="" href="https://docs.jdoodle.com/" target="_blank">our documentation</a>, or <a data-v-51632180="" href="https://www.youtube.com/channel/UCMg38oKj3kRmzksoRDEAs9Q" target="_blank">Youtube channel.</a> for more details</div></div></div><!----><div data-v-51632180="" class="columns"><div data-v-51632180="" class="column"><div data-v-5e428461="" data-v-51632180="" class="know-box box has-text-centered comment-box has-text-weight-semibold"><div data-v-5e428461="" class="has-text-centered is-underlined know-title">Know Your JDoodle</div><div data-v-5e428461="" class="has-text-left"><ul data-v-5e428461=""><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">JDoodle supports 76+ languages with multiple versions - <a data-v-5e428461="" class="is-link"> see all</a>.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">With <a data-v-5e428461="" href="https://www.jdoodle.com/compiler-api" class="is-link"> JDoodle APIs</a>, you can execute programs just by making a REST call.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">With <a data-v-5e428461="" href="https://www.jdoodle.com/compiler-api" class="is-link"> JDoodle Plugins</a>, you can embed an IDE to your website with just 3 lines of code.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">You can embed the code saved in JDoodle directly into your website/blog - <a data-v-5e428461="" target="_blank" href="http://blog.nutpan.com/2016/07/run-programs-directly-from-your-blog-or.html" class="is-link"> learn more</a>.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">If you like JDoodle, <a data-v-5e428461="" class="is-link">please share your love with your friends</a>.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">Fullscreen - side-by-side code and output is available. click the "<svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="expand" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-expand fa-w-14"><path data-v-5e428461="" fill="currentColor" d="M0 180V56c0-13.3 10.7-24 24-24h124c6.6 0 12 5.4 12 12v40c0 6.6-5.4 12-12 12H64v84c0 6.6-5.4 12-12 12H12c-6.6 0-12-5.4-12-12zM288 44v40c0 6.6 5.4 12 12 12h84v84c0 6.6 5.4 12 12 12h40c6.6 0 12-5.4 12-12V56c0-13.3-10.7-24-24-24H300c-6.6 0-12 5.4-12 12zm148 276h-40c-6.6 0-12 5.4-12 12v84h-84c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h124c13.3 0 24-10.7 24-24V332c0-6.6-5.4-12-12-12zM160 468v-40c0-6.6-5.4-12-12-12H64v-84c0-6.6-5.4-12-12-12H12c-6.6 0-12 5.4-12 12v124c0 13.3 10.7 24 24 24h124c6.6 0 12-5.4 12-12z" class=""></path></svg>" icon near execute button to switch.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">Dark Theme available. Click on "<svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="ellipsis-h" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="svg-inline--fa fa-ellipsis-h fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M328 256c0 39.8-32.2 72-72 72s-72-32.2-72-72 32.2-72 72-72 72 32.2 72 72zm104-72c-39.8 0-72 32.2-72 72s32.2 72 72 72 72-32.2 72-72-32.2-72-72-72zm-352 0c-39.8 0-72 32.2-72 72s32.2 72 72 72 72-32.2 72-72-32.2-72-72-72z" class=""></path></svg>" icon near execute button and select dark theme.</span></li><li data-v-5e428461=""><svg data-v-5e428461="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-5e428461="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-5e428461="" class="li-points">Check our <a data-v-5e428461="" target="_blank" href="https://docs.jdoodle.com/" class="is-link"> Documentation Page </a> for more info.</span></li></ul><div data-v-5e428461="" class="has-text-centered in-service">JDoodle is serving the programming community since 2013</div></div></div></div><div data-v-51632180="" class="column"><div data-v-362f2f54="" data-v-51632180="" class="know-box box has-text-centered comment-box has-text-weight-semibold"><div data-v-362f2f54="" class="has-text-centered is-underlined know-title">JDoodle For Your Organisation</div><div data-v-362f2f54="" class="has-text-left"><ul data-v-362f2f54=""><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Do you have any specific compiler requirements?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Do you want to integrate compilers with your website, webapp, mobile app, courses?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Are you looking more features in
              <a data-v-362f2f54="" target="_blank" href="https://www.jdoodle.com/compiler-api" class="is-link"> JDoodle Plugin </a> and
              <a data-v-362f2f54="" target="_blank" href="https://www.jdoodle.com/compiler-api" class="is-link"> JDoodle API </a>?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Looking for Multiple Files, Connecting to DB, Debugging, etc.?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Are you building any innovative solution for your students or recruitment?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Want to run JDoodle in-house?</span></li><li data-v-362f2f54=""><svg data-v-362f2f54="" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="dot-circle" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" class="has-text-grey-dark svg-inline--fa fa-dot-circle fa-w-16"><path data-v-362f2f54="" fill="currentColor" d="M256 8C119.033 8 8 119.033 8 256s111.033 248 248 248 248-111.033 248-248S392.967 8 256 8zm80 248c0 44.112-35.888 80-80 80s-80-35.888-80-80 35.888-80 80-80 80 35.888 80 80z" class=""></path></svg><span data-v-362f2f54="" class="li-points">Custom Domain, White-labelled pages for your institute?</span></li></ul></div><div data-v-362f2f54="" class="has-text-centered in-service">Contact us at hello@jdoodle.com</div></div></div></div><div data-v-51632180="" class="margin-top-20px has-text-centered"><div data-v-51632180="" class="has-text-centered">Thanks for using our
        <h1 data-v-51632180="" class="title has-text-centered is-marginless">Online Java <span data-v-51632180="">Compiler</span>
          IDE</h1>
        to execute your program</div></div><div data-v-51632180="" class="columns is-mobile margin-top-10px"><div data-v-51632180="" class="column is-10-mobile is-offset-1-mobile is-8-tablet is-offset-2-tablet is-6-desktop is-offset-3-desktop has-text-centered comment-box has-text-weight-semibold"><div data-v-5cbc0b3b="" data-v-51632180="" class="margin-top-20px margin-bottom-10px has-text-centered"><div data-v-5cbc0b3b="" class="level has-text-centered"><div data-v-5cbc0b3b="" class="level-item store-img"><a data-v-5cbc0b3b="" href="https://play.google.com/store/apps/details?id=com.nutpan.jdoodle_app&amp;pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1" target="_blank"><img data-v-5cbc0b3b="" src="./DemoPrimev4_files/google-play-badge.db9b21a1.png" alt="Get it on Google Play" class="google-store-img"></a></div><div data-v-5cbc0b3b="" class="level-item store-img"><a data-v-5cbc0b3b="" href="https://apps.apple.com/us/app/jdoodle/id1544598494" target="_blank"><img data-v-5cbc0b3b="" src="./DemoPrimev4_files/Apple_Store_Badge.2928664f.svg" alt="Get it on Apple Store" class="apple-store-img"></a></div></div></div></div></div><div data-v-719d6a05="" data-v-51632180="" class="is-hidden-print"><div data-v-719d6a05="" class="has-text-centered comment-box-title has-text-weight-semibold">
    Your valuable input will help us improve this site <br data-v-719d6a05="">
    please give your comments. Thanks.
  </div><div data-v-719d6a05=""><div data-v-719d6a05="" class="columns is-mobile"><div data-v-719d6a05="" class="column is-10-mobile is-offset-1-mobile is-8-tablet is-offset-2-tablet is-6-desktop is-offset-3-desktop box comment-box has-text-weight-semibold"><div data-v-719d6a05="" class="other-languages"><a data-v-719d6a05="" class="is-link has-text-weight-bold">
            Click here
          </a>
          to see the languages currently supported.
        </div><div data-v-719d6a05="" class="what-next">
          Which language would you like to see next in JDoodle?
        </div><div data-v-719d6a05=""><div data-v-719d6a05="" class="columns"><div data-v-719d6a05="" class="column"><div data-v-719d6a05="" class="field has-addons"><div data-v-719d6a05="" class="control is-expanded"><input data-v-719d6a05="" data-vv-as="Language" maxlength="50" name="language" placeholder="New Language" type="text" class="input input" aria-required="true" aria-invalid="false"></div><div data-v-719d6a05="" class="control"><button data-v-719d6a05="" class="button has-text-weight-bold">
                    Add This
                  </button></div></div><div data-v-719d6a05=""><span data-v-719d6a05="" class="help is-danger" style="display: none;"></span></div></div></div><div data-v-719d6a05="" class="what-next what-next-thanks" style="display: none;">
            Thanks for your Input!
          </div><div data-v-719d6a05="" class="what-next what-next-thanks" style="display: none;">
             is already available at
            <a data-v-719d6a05="" href="https://www.jdoodle.com/online-java-compiler/"></a></div></div><div data-v-719d6a05="" class="what-next">Comments/Suggestions/Inputs...</div><div data-v-719d6a05="" class="columns"><div data-v-719d6a05="" class="column"><textarea data-v-719d6a05="" data-vv-as="Comment" name="comment" rows="6" class="textarea input" aria-required="true" aria-invalid="false"></textarea><span data-v-719d6a05="" class="help is-danger" style="display: none;"></span><div data-v-719d6a05="" class="is-size-7 note">
              For direct response, please include your email id in the comment
              <br data-v-719d6a05="">
              or email to
              <a data-v-719d6a05="" href="mailto:hello@jdoodle.com">hello@jdoodle.com</a></div><button data-v-719d6a05="" type="button" class="myButton has-text-weight-bold">
              Post Comment
            </button></div></div><div data-v-719d6a05="" class="what-next what-next-thanks has-text-centered" style="display: none;">
          Thanks for your Input!
        </div></div></div></div></div></div></div><!----><div data-v-43d185a5="" class="footer"><div data-v-43d185a5="" class="footer_logo"><img data-v-43d185a5="" alt="footer_logo" src="data:image/png;base64,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"></div><div data-v-43d185a5="" class="info"><div data-v-43d185a5="" class="menu_block"><div data-v-43d185a5=""><p data-v-43d185a5="">Products</p><button data-v-43d185a5="">Online IDEs</button><a data-v-43d185a5="" href="https://www.jdoodle.com/compiler-api" class="">APIs and Plugin</a><a data-v-43d185a5="" href="https://www.jdoodle.com/guru" class="">Teach and Assess</a></div><div data-v-43d185a5=""><p data-v-43d185a5="">Docs</p><a data-v-43d185a5="" href="https://docs.jdoodle.com/" target="_blank">Docs</a><a data-v-43d185a5="" href="https://www.jdoodle.com/terms/" target="_blank">Privacy and Terms of Use</a></div><div data-v-43d185a5=""><p data-v-43d185a5="">Contact</p><a data-v-43d185a5="" href="mailto:hello@jdoodle.com" target="_blank">hello@jdoodle.com</a><button data-v-43d185a5="">Feedback</button><!----></div></div><div data-v-43d185a5="" class="social_networks_block"><div data-v-43d185a5=""><p data-v-43d185a5="">© 2013-2023 Nutpan pty Ltd. All Rights Reserved</p><p data-v-43d185a5="">
          JDoodle uses cookies. Please read our <a data-v-43d185a5="" href="https://www.jdoodle.com/terms/" target="_blank">Terms of Use</a> before using
          this
          service
        </p></div><div data-v-43d185a5="" class="social_networks"><a data-v-43d185a5="" href="mailto:hello@jdoodle.com" target="_blank"><img data-v-43d185a5="" alt="mail" src="./DemoPrimev4_files/mail.f6fc265b.svg"></a><a data-v-43d185a5="" href="https://www.facebook.com/jdoodleide" target="_blank"><img data-v-43d185a5="" alt="facebook" src="./DemoPrimev4_files/facebook.7f9826e9.svg"></a><a data-v-43d185a5="" href="https://twitter.com/jdoodleide" target="_blank"><img data-v-43d185a5="" alt="twitter" src="./DemoPrimev4_files/twitter.07d7dbbe.svg"></a><a data-v-43d185a5="" href="https://www.linkedin.com/company/jdoodle" target="_blank"><img data-v-43d185a5="" alt="linkedin" src="./DemoPrimev4_files/linkedin.53863d71.svg"></a></div></div></div></div></div><script>window.TogetherJSConfig_hubBase = 'https://tjhub.jdoodle.com/';
			window.ga =
				window.ga ||
				function () {
					(ga.q = ga.q || []).push(arguments);
				};
			ga.l = +new Date();
			ga('create', 'UA-42395517-1', 'auto');
			window.TogetherJSConfig_hubBase = 'https://tjhub.jdoodle.com/';</script><script async="" src="./DemoPrimev4_files/analytics.js.download"></script><script async="" src="./DemoPrimev4_files/togetherjs-min.js.download"></script><script async="" src="./DemoPrimev4_files/api.js.download"></script><script src="./DemoPrimev4_files/chunk-vendors.ccd68b53.js.download"></script><script src="./DemoPrimev4_files/app.374a512a.js.download"></script><script type="text/javascript" async="" src="./DemoPrimev4_files/ace.min.js.download"></script><script type="text/javascript" async="" src="./DemoPrimev4_files/ext-language_tools.js.download"></script><script type="text/javascript" async="" src="./DemoPrimev4_files/ext-static_highlight.js.download"></script><div style="visibility: hidden; position: absolute; width: 100%; top: -10000px; left: 0px; right: 0px; transition: visibility 0s linear 0.3s, opacity 0.3s linear 0s; opacity: 0;"><div style="width: 100%; height: 100%; position: fixed; top: 0px; left: 0px; z-index: 2000000000; background-color: rgb(255, 255, 255); opacity: 0.5;"></div><div style="margin: 0px auto; top: 0px; left: 0px; right: 0px; position: absolute; border: 1px solid rgb(204, 204, 204); z-index: 2000000000; background-color: rgb(255, 255, 255); overflow: hidden;"><iframe title="recaptcha challenge expires in two minutes" src="./DemoPrimev4_files/bframe.html" name="c-ukuq9fitxocl" frameborder="0" scrolling="no" sandbox="allow-forms allow-popups allow-same-origin allow-scripts allow-top-navigation allow-modals allow-popups-to-escape-sandbox" style="width: 100%; height: 100%;"></iframe></div></div></body></html>