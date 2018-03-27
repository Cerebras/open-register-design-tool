/*   Ordt 180327.01 autogenerated file 
 *   Input: ./rdl_uvmmem_default/test.rdl
 *   Parms: ./rdl_uvmmem_default/test.parms
 *   Date: Tue Mar 27 14:56:12 EDT 2018
 */

register_set top "Registers for top" {

  address = 0x0;
  register_width = 32;
  register sr1 "sr1 register" {
    address = 0x0;
    integer fld1[32] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register wr1 "wr1 register" {
    address = 0x100;
    register_width = 128;
    integer fld8[16] "fld8 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld7[16] "fld7 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld6[16] "fld6 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld5[16] "fld5 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld4[16] "fld4 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld3[16] "fld3 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld2[16] "fld2 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld1[16] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register sr_repeat1 "sr_repeat1 register" {
    address = 0x200;
    integer fld1[32] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register sr_repeat2 "sr_repeat2 register" {
    address = 0x204;
    integer fld1[32] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register sr_repeat3 "sr_repeat3 register" {
    address = 0x208;
    integer fld1[32] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register srmem1 "srmem1 register" {
    address = 0x2000;
    repeat = 100;
    integer fld1[32] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register wrmem1 "wrmem1 register" {
    address = 0x20000;
    register_width = 128;
    repeat = 300;
    integer fld8[16] "fld8 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld7[16] "fld7 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld6[16] "fld6 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld5[16] "fld5 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld4[16] "fld4 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld3[16] "fld3 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld2[16] "fld2 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
    integer fld1[16] "fld1 field" param {
      access_mode = READ_WRITE;
      reset = 0x0;
    };
  };
  
  register_set_size = 0x212c0;
};

