
function wpssGetCookie(e){var t=document.cookie.indexOf(e+'=');var n=t+e.length+1;if(!t&&e!=document.cookie.substring(0,e.length)){return null}if(t==-1)return null;var r=document.cookie.indexOf(';',n);if(r==-1)r=document.cookie.length;return unescape(document.cookie.substring(n,r))}function wpssSetCookie(e,t,n,r,i,s){var o=new Date;o.setTime(o.getTime());if(n){n=n*1e3*60*60*24}var u=new Date(o.getTime()+n);document.cookie=e+'='+escape(t)+(n?';expires='+u.toGMTString():'')+(r?';path='+r:'')+(i?';domain='+i:'')+(s?';secure':'')}function wpssDeleteCookie(e,t,n){if(wpssGetCookie(e))document.cookie=e+'='+(t?';path='+t:'')+(n?';domain='+n:'')+';expires=Thu, 01-Jan-1970 00:00:01 GMT'}
function wpssCommentVal(){wpssSetCookie('c1de2678ef2b876b096d1160f33b5bbe','9cb26d16bef1f6945e1137d353646cea','','/');wpssSetCookie('SJECT15','CKON15','','/');}
wpssCommentVal();jQuery(document).ready(function($){var h="form[method='post']";$(h).submit(function(){$('<input>').attr('type','hidden').attr('name','dfce4525b4b6643adc89390d543304d6').attr('value','55a005ddf637fbfc17e4bc885c501993').appendTo(h);return true;})});
// Generated in: 0.000311 seconds