//IDEA
var versionIDEAShort = "14.1";
var versionIDEALong = "14.1.3";
function versionIDEA(el) {
    if (el == "short") {
        document.write(versionIDEAShort);
    }
    if (el == "long") {
        document.write(versionIDEALong);
    }
}
function onloadVersionIDEA() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionIDEALong);
}
function onloadVersionIDEADownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionIDEALong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionIDEALong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionIDEALong);
    document.getElementById('kit_').innerHTML = document.getElementById('kit_').innerHTML.replace(/#Numberversion/gi, versionIDEALong);
}

//Resharper
var versionRSShort = "9";
var versionRSLong = "9.1";
function versionRS(el) {
    if (el == "short") {
        document.write(versionRSShort);
    }
    if (el == "long") {
        document.write(versionRSLong);
    }
}
function onloadVersionRS() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionRSLong);
}
function onloadVersionRSDownload() {
    document.getElementById('full_').innerHTML = document.getElementById('full_').innerHTML.replace(/#Numberversion/gi, versionRSLong);
    document.getElementById('cSharp_').innerHTML = document.getElementById('cSharp_').innerHTML.replace(/#Numberversion/gi, versionRSLong);
    document.getElementById('vb_').innerHTML = document.getElementById('vb_').innerHTML.replace(/#Numberversion/gi, versionRSLong);
}

//Resharper C++
var versionRSCppShort = "1";
var versionRSCppLong = "1.0";
function versionRSCpp(el) {
    if (el == "short") {
        document.write(versionRSCppShort);
    }
    if (el == "long") {
        document.write(versionRSCppLong);
    }
}

//dotTrace
var versionDTShort = "6";
var versionDTLong = "6.1";
var versionDTMLong = "3.5";
function versionDT(el) {
    if (el == "short") {
        document.write(versionDTShort);
    }
    if (el == "long") {
        document.write(versionDTLong);
    }
}
function onloadVersionDT() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionDTLong);
}
function onloadVersionDTDownload() {
    document.getElementById('win32_').innerHTML = document.getElementById('win32_').innerHTML.replace(/#Numberversion/gi, versionDTLong);
    document.getElementById('win64_').innerHTML = document.getElementById('win64_').innerHTML.replace(/#Numberversion/gi, versionDTLong);
}

//dotMemory
var versionDMShort = "4";
var versionDMLong = "4.3";
function versionDM(el) {
    if (el == "short") {
        document.write(versionDMShort);
    }
    if (el == "long") {
        document.write(versionDMLong);
    }
}
function onloadVersionDM() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionDMLong);
}
function onloadVersionDMDownload() {
    document.getElementById('win32_').innerHTML = document.getElementById('win32_').innerHTML.replace(/#Numberversion/gi, versionDMLong);
    document.getElementById('win64_').innerHTML = document.getElementById('win64_').innerHTML.replace(/#Numberversion/gi, versionDMLong);
}

//dotCover
var versionDCShort = "3";
var versionDCLong = "3.1";
function versionDC(el) {
    if (el == "short") {
        document.write(versionDCShort);
    }
    if (el == "long") {
        document.write(versionDCLong);
    }
}
function onloadVersionDC() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionDCLong);
}
function onloadVersionDCDownload() {
    document.getElementById('win32_').innerHTML = document.getElementById('win32_').innerHTML.replace(/#Numberversion/gi, versionDCLong);
    document.getElementById('win64_').innerHTML = document.getElementById('win64_').innerHTML.replace(/#Numberversion/gi, versionDCLong);
}

//dotPeek
var versionDPShort = "1";
var versionDPLong = "1.4";
function versionDP(el) {
    if (el == "short") {
        document.write(versionDPShort);
    }
    if (el == "long") {
        document.write(versionDPLong);
    }
}
function onloadVersionDP() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionDPLong);
}
function onloadVersionDPDownload() {
    document.getElementById('win32_').innerHTML = document.getElementById('win32_').innerHTML.replace(/#Numberversion/gi, versionDPLong);
    document.getElementById('win64_').innerHTML = document.getElementById('win64_').innerHTML.replace(/#Numberversion/gi, versionDPLong);
}

//TeamCity
var versionTCShort = "9.0";
var versionTCLong = "9.0.4";
function versionTC(el) {
    if (el == "short") {
        document.write(versionTCShort);
    }
    if (el == "long") {
        document.write(versionTCLong);
    }
}
function onloadVersionTC() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionTCLong);
}
function onloadVersionTCownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionTCLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionTCLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionTCLong);
    document.getElementById('j2ee_').innerHTML = document.getElementById('j2ee_').innerHTML.replace(/#Numberversion/gi, versionTCLong);
}


//RubyMine
var versionRubyShort = "7.1";
var versionRubyLong = "7.1.2";
function versionRuby(el) {
    if (el == "short") {
        document.write(versionRubyShort);
    }
    if (el == "long") {
        document.write(versionRubyLong);
    }
}
function onloadVersionRM() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionRubyLong);
}
function onloadVersionRMDownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionRubyLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionRubyLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionRubyLong);
    document.getElementById('kit_').innerHTML = document.getElementById('kit_').innerHTML.replace(/#Numberversion/gi, versionRubyLong);
}

//MPS
var versionMPSShort = "3.2";
var versionMPSLong = "3.2.1";
function versionMPS(el) {
    if (el == "short") {
        document.write(versionMPSShort);
    }
    if (el == "long") {
        document.write(versionMPSLong);
    }
}
function onloadVersionMPS() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionMPSLong);
}
function onloadVersionMPSownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionMPSLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionMPSLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionMPSLong);
    document.getElementById('src_').innerHTML = document.getElementById('src_').innerHTML.replace(/#Numberversion/gi, versionMPSLong);
    document.getElementById('tools_').innerHTML = document.getElementById('tools_').innerHTML.replace(/#Numberversion/gi, versionMPSLong);
}

//Web IDE
var versionWebIDEShort = "1.0";
var versionWebIDELong = "1.0";
function versionWebIDE(el) {
    if (el == "short") {
        document.write(versionWebIDEShort);
    }
    if (el == "long") {
        document.write(versionWebIDELong);
    }
}
function onloadVersionWebIDE() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
}
function onloadVersionWebIDEownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
    document.getElementById('src_').innerHTML = document.getElementById('src_').innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
    document.getElementById('tools_').innerHTML = document.getElementById('tools_').innerHTML.replace(/#Numberversion/gi, versionWebIDELong);
}

//PyCharm
var versionPyCharmShort = "4.5";
var versionPyCharmLong = "4.5";
function versionPyCharm(el) {
    if (el == "short") {
        document.write(versionPyCharmShort);
    }
    if (el == "long") {
        document.write(versionPyCharmLong);
    }
}
function onloadVersionPyCharm() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
}
function onloadVersionPyCharmownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
    document.getElementById('src_').innerHTML = document.getElementById('src_').innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
    document.getElementById('tools_').innerHTML = document.getElementById('tools_').innerHTML.replace(/#Numberversion/gi, versionPyCharmLong);
}

//PyCharm Educational Edition
var versionPyCharmEDUShort = "1.0";
var versionPyCharmEDULong = "1.0.1";
function versionPyCharmEDU(el) {
    if (el == "short") {
        document.write(versionPyCharmEDUShort);
    }
    if (el == "long") {
        document.write(versionPyCharmEDULong);
    }
}
function onloadVersionPyCharmEDU() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionPyCharmEDULong);
}


//YouTrack
var versionYTShort = "6.0";
var versionYTLong = "6.0.12634";
function versionYT(el) {
    if (el == "short") {
        document.write(versionYTShort);
    }
    if (el == "long") {
        document.write(versionYTLong);
    }
}
function onloadVersionYT() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionYTLong);
}
function onloadVersionYTownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionYTLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionYTLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionYTLong);
    document.getElementById('src_').innerHTML = document.getElementById('src_').innerHTML.replace(/#Numberversion/gi, versionYTLong);
    document.getElementById('tools_').innerHTML = document.getElementById('tools_').innerHTML.replace(/#Numberversion/gi, versionYTLong);
}


//WebStorm
var versionWebStormShort = "10.0";
var versionWebStormLong = "10.0.2";
function versionWebStorm(el) {
    if (el == "short") {
        document.write(versionWebStormShort);
    }
    if (el == "long") {
        document.write(versionWebStormLong);
    }
}
function onloadVersionWebStorm() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionWebStormLong);
}
function onloadVersionWebStormDownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionWebStormLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionWebStormLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionWebStormLong);
}


//PhpStorm
var versionPhpStormShort = "8.0";
var versionPhpStormLong = "8.0.3";
function versionPhpStorm(el) {
    if (el == "short") {
        document.write(versionPhpStormShort);
    }
    if (el == "long") {
        document.write(versionPhpStormLong);
    }
}
function onloadVersionPhpStorm() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionPhpStormLong);
}
function onloadVersionPhpStormDownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionPhpStormLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionPhpStormLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionPhpStormLong);
}

//AppCode
var versionAppCodeShort = "3.1";
var versionAppCodeLong = "3.1.6";
function versionAppCode(el) {
    if (el == "short") {
        document.write(versionAppCodeShort);
    }
    if (el == "long") {
        document.write(versionAppCodeLong);
    }
}
function onloadVersionAppCode() {
    document.body.innerHTML = document.body.innerHTML.replace(/#Numberversion/gi, versionAppCodeLong);
}
function onloadVersionAppCodeDownload() {
    document.getElementById('win_').innerHTML = document.getElementById('win_').innerHTML.replace(/#Numberversion/gi, versionAppCodeLong);
    document.getElementById('mac_').innerHTML = document.getElementById('mac_').innerHTML.replace(/#Numberversion/gi, versionAppCodeLong);
    document.getElementById('linux_').innerHTML = document.getElementById('linux_').innerHTML.replace(/#Numberversion/gi, versionAppCodeLong);
}

//Upsource
var versionUpsourceShort = "1";
var versionUpsourceLong = "1.0.1";
function versionUpsource(el) {
    if (el == "short") {
        document.write(versionUpsourceShort);
    }
    if (el == "long") {
        document.write(versionUpsourceLong);
    }
}


//CLion
var versionCLionShort = "1.0";
var versionCLionLong = "1.0.1";
function versionCLion(el) {
    if (el == "short") {
        document.write(versionCLionShort);
    }
    if (el == "long") {
        document.write(versionCLionLong);
    }
}
