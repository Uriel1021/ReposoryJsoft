function eliminar(id) {
	swal({
		title: "Estas seguro WEY!!!?",
		text: "UNA VEZ BORRADA, y NO querias, MAMASTE!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((Ok) => {
			if (Ok) {
				$.ajax({
					url:"/eliminar/"+id,
					success:function(res){
						console.log(res);
					},
				});
				swal("MAMO! LO BORRASTE WEY!", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";	
					}
				});
			} else {
				swal("NO LA CAGASTE PRRO!!!, SIGUE A SALVO TU REGISTRO!");
			}
		});
}