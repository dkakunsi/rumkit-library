package com.dbsys.rs.lib.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BAHAN HABIS PAKAI")
public class PemakaianBhp extends Pemakaian { }
