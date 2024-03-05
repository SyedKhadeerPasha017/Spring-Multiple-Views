function dollarToRupee()
{
	const exchangerate=83.35
	const dollarInput1=document.getElementById("dollarInput").value;
	const rupeeOutputNew=parseFloat(dollarInput1)*exchangerate;
	document.getElementById("rupeeOutput").value=rupeeOutputNew.toFixed(2);
}
dollarToRupee();