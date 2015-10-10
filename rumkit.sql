DROP DATABASE IF EXISTS rumkit;
CREATE DATABASE rumkit;
USE rumkit;

CREATE TABLE unit (
	id int(10) auto_increment,
	nama varchar(255) not null,
	bobot float(10) not null,
	primary key (id)
) ENGINE = InnoDB;

CREATE TABLE operator (
	id int(10) auto_increment,
	nama varchar(255) not null,
	username varchar(255) not null,
	password varchar(255) not null,
	role int(1) not null,
	unit int(10) not null,
	unique (username),
	primary key (id),
	foreign key (unit) references unit (id)
) ENGINE = InnoDB;

CREATE TABLE token (
	kode varchar(255),
	tanggal_buat date not null,
	tanggal_expire date not null,
	status int(1) not null,
	operator int(10) not null,
	primary key (kode),
	foreign key (operator) references operator (id)
) ENGINE = InnoDB;

CREATE TABLE penduduk (
	id int(10) auto_increment,
	kode varchar(255) not null,
	nik varchar(255) not null,
	nama varchar(255) not null,
	kelamin int(1) not null,
	tanggal_lahir date not null,
	darah varchar(255) not null,
	agama varchar(255) not null,
	telepon varchar(255) not null,
	unique(kode),
	unique(nik),
	primary key (id)
) ENGINE = InnoDB;

CREATE TABLE pasien (
	id int(10) auto_increment,
	tipe varchar(255) not null,
	kode varchar(255) not null,
	status int(1) not null,
	tanggungan int(1) not null,
	kelas int(1),
	tanggal_masuk date not null,
	tanggal_keluar date,
	total_tagihan int(10),
	cicilan int(10),
	keadaan int(1),
	penduduk int(10) not null,
	ruang_perawatan int(10),
	primary key (id),
	foreign key (penduduk) references penduduk(id),
	foreign key (ruang_perawatan) references unit(id)
) ENGINE = InnoDB;

CREATE TABLE pegawai (
	id int(10) auto_increment,
	nip varchar(255),
	spesialisasi int(1),
	tipe varchar(255) not null,
	penduduk int(10) not null,
	unique(nip),
	primary key (id),
	foreign key (penduduk) references penduduk(id)
) ENGINE = InnoDB;

CREATE TABLE kategori_tindakan (
	id int(10) auto_increment,
	nama varchar(255) not null,
	parent int(10),
	primary key (id),
	foreign key (parent) references kategori_tindakan(id)
) ENGINE = InnoDB;

CREATE TABLE tindakan (
	id int(10) auto_increment,
	kode varchar(255) not null,
	nama varchar(255) not null,
	tarif int(10) not null,
	keterangan varchar(255),
	satuan int(1) not null,
	kelas int(1) not null,
	tanggungan int(1) not null,
	kategori int(10) not null,
	unique(kode),
	primary key (id),
	foreign key (kategori) references kategori_tindakan(id)
) ENGINE = InnoDB;

CREATE TABLE pelayanan (
	id int(10) auto_increment,
	tanggal date not null,
	jumlah int(10) not null,
	biaya_tambahan int(10),
	keterangan varchar(255),
	tipe varchar(255) not null,
	tanggal_selesai date,
	jam_masuk time(6),
	jam_keluar time(6),
	pasien int(10) not null,
	tindakan int(10) not null,
	pelaksana int(10) not null,
	unit int(10) not null,
	primary key (id),
	foreign key (pasien) references pasien(id),
	foreign key (tindakan) references tindakan(id),
	foreign key (pelaksana) references operator(id),
	foreign key (unit) references unit(id)
) ENGINE = InnoDB;

CREATE TABLE barang (
	id int(10) auto_increment,
	kode varchar(255) not null,
	nama varchar(255) not null,
	jumlah int(10) not null,
	satuan varchar(255) not null,
	harga int(10) not null,
	tanggungan int(1) not null,
	tipe varchar(255) not null,
	keterangan varchar(255),
	unique(kode),
	primary key (id)
) ENGINE = InnoDB;

CREATE TABLE stok (
	id int(10) auto_increment,
	jumlah int(10) not null,
	tanggal date not null,
	jam time(6) not null,
	tipe varchar(255) not null,
	barang int(10) not null,
	primary key (id),
	foreign key (barang) references barang(id)
) ENGINE = InnoDB;

CREATE TABLE pemakaian (
	id int(10) auto_increment,
	tanggal date not null,
	jumlah int(10) not null,
	biaya_tambahan int(10),
	keterangan int(10),
	tipe varchar(255) not null,
	nomor_resep varchar(255), 
	asal int(1),
	nama varchar(255),
	barang int(10) not null,
	pasien int(10) not null,
	primary key (id),
	foreign key (pasien) references pasien(id),
	foreign key (barang) references barang(id)
) ENGINE = InnoDB;
